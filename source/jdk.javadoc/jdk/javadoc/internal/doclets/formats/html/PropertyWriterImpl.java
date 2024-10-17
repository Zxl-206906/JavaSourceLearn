/*
 * Copyright (c) 1997, 2023, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package jdk.javadoc.internal.doclets.formats.html;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

import jdk.javadoc.internal.doclets.formats.html.markup.ContentBuilder;
import jdk.javadoc.internal.doclets.formats.html.markup.Entity;
import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle;
import jdk.javadoc.internal.doclets.formats.html.markup.HtmlTree;
import jdk.javadoc.internal.doclets.formats.html.markup.Text;
import jdk.javadoc.internal.doclets.toolkit.Content;
import jdk.javadoc.internal.doclets.toolkit.MemberSummaryWriter;
import jdk.javadoc.internal.doclets.toolkit.PropertyWriter;

/**
 * Writes property documentation in HTML format.
 */
public class PropertyWriterImpl extends AbstractMemberWriter
    implements PropertyWriter, MemberSummaryWriter {

    public PropertyWriterImpl(SubWriterHolderWriter writer, TypeElement typeElement) {
        super(writer, typeElement);
    }

    @Override
    public Content getMemberSummaryHeader(TypeElement typeElement, Content content) {
        content.add(MarkerComments.START_OF_PROPERTY_SUMMARY);
        Content memberContent = new ContentBuilder();
        writer.addSummaryHeader(this, memberContent);
        return memberContent;
    }

    @Override
    public void addSummary(Content summariesList, Content content) {
        writer.addSummary(HtmlStyle.propertySummary,
                HtmlIds.PROPERTY_SUMMARY, summariesList, content);
    }

    @Override
    public Content getPropertyDetailsHeader(Content memberDetails) {
        memberDetails.add(MarkerComments.START_OF_PROPERTY_DETAILS);
        Content propertyDetailsContent = new ContentBuilder();
        var heading = HtmlTree.HEADING(Headings.TypeDeclaration.DETAILS_HEADING,
                contents.propertyDetailsLabel);
        propertyDetailsContent.add(heading);
        return propertyDetailsContent;
    }

    @Override
    public Content getPropertyHeaderContent(ExecutableElement property) {
        Content content = new ContentBuilder();
        var heading = HtmlTree.HEADING(Headings.TypeDeclaration.MEMBER_HEADING,
                Text.of(utils.getPropertyLabel(name(property))));
        content.add(heading);
        return HtmlTree.SECTION(HtmlStyle.detail, content)
                .setId(htmlIds.forProperty(property));
    }

    @Override
    public Content getSignature(ExecutableElement property) {
        return new Signatures.MemberSignature(property, this)
                .setType(utils.getReturnType(typeElement, property))
                .setAnnotations(writer.getAnnotationInfo(property, true))
                .toContent();
    }

    @Override
    public void addDeprecated(ExecutableElement property, Content propertyContent) {
    }

    @Override
    public void addPreview(ExecutableElement property, Content content) {
    }

    @Override
    public void addComments(ExecutableElement property, Content propertyContent) {
        TypeElement holder = (TypeElement)property.getEnclosingElement();
        if (!utils.getFullBody(property).isEmpty()) {
            if (holder.equals(typeElement) ||
                    (!utils.isPublic(holder) || utils.isLinkable(holder))) {
                writer.addInlineComment(property, propertyContent);
            } else {
                if (!utils.hasHiddenTag(holder) && !utils.hasHiddenTag(property)) {
                    Content link =
                            writer.getDocLink(HtmlLinkInfo.Kind.PLAIN,
                                    holder, property,
                                    utils.isIncluded(holder)
                                            ? holder.getSimpleName() : holder.getQualifiedName());
                    var codeLink = HtmlTree.CODE(link);
                    var descriptionFromLabel = HtmlTree.SPAN(HtmlStyle.descriptionFromTypeLabel,
                            utils.isClass(holder)
                                    ? contents.descriptionFromClassLabel
                                    : contents.descriptionFromInterfaceLabel);
                    descriptionFromLabel.add(Entity.NO_BREAK_SPACE);
                    descriptionFromLabel.add(codeLink);
                    propertyContent.add(HtmlTree.DIV(HtmlStyle.block, descriptionFromLabel));
                }
                writer.addInlineComment(property, propertyContent);
            }
        }
    }

    @Override
    public void addTags(ExecutableElement property, Content propertyContent) {
        writer.addTagsInfo(property, propertyContent);
    }

    @Override
    public Content getPropertyDetails(Content memberDetailsHeader, Content memberDetails) {
        return writer.getDetailsListItem(
                HtmlTree.SECTION(HtmlStyle.propertyDetails)
                        .setId(HtmlIds.PROPERTY_DETAIL)
                        .add(memberDetailsHeader)
                        .add(memberDetails));
    }

    @Override
    public void addSummaryLabel(Content content) {
        var label = HtmlTree.HEADING(Headings.TypeDeclaration.SUMMARY_HEADING,
                contents.propertySummaryLabel);
        content.add(label);
    }

    @Override
    public TableHeader getSummaryTableHeader(Element member) {
        return new TableHeader(contents.typeLabel, contents.propertyLabel,
                contents.descriptionLabel);
    }

    @Override
    protected Table<Element> createSummaryTable() {
        return new Table<Element>(HtmlStyle.summaryTable)
                .setCaption(contents.properties)
                .setHeader(getSummaryTableHeader(typeElement))
                .setColumnStyles(HtmlStyle.colFirst, HtmlStyle.colSecond, HtmlStyle.colLast);
    }

    @Override
    public void addInheritedSummaryLabel(TypeElement typeElement, Content content) {
        Content classLink = writer.getPreQualifiedClassLink(
                HtmlLinkInfo.Kind.PLAIN, typeElement);
        Content label;
        if (options.summarizeOverriddenMethods()) {
            label = Text.of(utils.isClass(typeElement)
                    ? resources.getText("doclet.Properties_Declared_In_Class")
                    : resources.getText("doclet.Properties_Declared_In_Interface"));
        } else {
            label = Text.of(utils.isClass(typeElement)
                    ? resources.getText("doclet.Properties_Inherited_From_Class")
                    : resources.getText("doclet.Properties_Inherited_From_Interface"));
        }
        var labelHeading =
                HtmlTree.HEADING(Headings.TypeDeclaration.INHERITED_SUMMARY_HEADING, label)
                        .setId(htmlIds.forInheritedProperties(typeElement))
                        .add(Entity.NO_BREAK_SPACE)
                        .add(classLink);
        content.add(labelHeading);
    }

    @Override
    protected void addSummaryLink(HtmlLinkInfo.Kind context, TypeElement typeElement, Element member,
                                  Content content) {
        Content memberLink = writer.getDocLink(context, typeElement,
                member,
                Text.of(utils.getPropertyLabel(name(member))),
                HtmlStyle.memberNameLink,
                true);

        var code = HtmlTree.CODE(memberLink);
        content.add(code);
    }

    @Override
    protected void addInheritedSummaryLink(TypeElement typeElement, Element member, Content target) {
        String mname = name(member);
        Content content = writer.getDocLink(HtmlLinkInfo.Kind.PLAIN, typeElement, member,
                utils.isProperty(mname) ? utils.getPropertyName(mname) : mname, true);
        target.add(content);
    }

    @Override
    protected void addSummaryType(Element member, Content content) {
        addModifiersAndType(member, utils.getReturnType(typeElement, (ExecutableElement)member), content);
    }

    @Override
    protected Content getSummaryLink(Element member) {
        return writer.getDocLink(HtmlLinkInfo.Kind.SHOW_PREVIEW, member,
                utils.getFullyQualifiedName(member));
    }

}
