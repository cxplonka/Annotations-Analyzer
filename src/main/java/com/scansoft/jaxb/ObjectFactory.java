//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.29 um 09:05:24 PM CEST 
//


package com.scansoft.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scansoft.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FillGraphicsTypeRightBorder_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "rightBorder");
    private final static QName _FillGraphicsTypeLeftBorder_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "leftBorder");
    private final static QName _FillGraphicsTypeTopBorder_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "topBorder");
    private final static QName _FillGraphicsTypeBottomBorder_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "bottomBorder");
    private final static QName _RunTypeTab_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "tab");
    private final static QName _RunTypeCircleText_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "circleText");
    private final static QName _RunTypeFormGroup_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "formGroup");
    private final static QName _RunTypeNl_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "nl");
    private final static QName _RunTypeCheckBox_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "checkBox");
    private final static QName _RunTypeFieldCode_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "fieldCode");
    private final static QName _RunTypeCh_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "ch");
    private final static QName _RunTypeInputLine_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "inputLine");
    private final static QName _RunTypeFillGraphics_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "fillGraphics");
    private final static QName _RunTypeSpace_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "space");
    private final static QName _RunTypeWd_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "wd");
    private final static QName _RunTypeRun_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "run");
    private final static QName _RunTypeAlt_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "alt");
    private final static QName _RunTypeLink_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "link");
    private final static QName _ParaTypeBullet_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "bullet");
    private final static QName _ParaTypeDropCap_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "dropCap");
    private final static QName _ParaTypeLn_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "ln");
    private final static QName _ParaTypeTabs_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "tabs");
    private final static QName _FormGroupTypeRulerline_QNAME = new QName("https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", "rulerline");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scansoft.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link SummaryType }
     * 
     */
    public SummaryType createSummaryType() {
        return new SummaryType();
    }

    /**
     * Create an instance of {@link PageType }
     * 
     */
    public PageType createPageType() {
        return new PageType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link RunType }
     * 
     */
    public RunType createRunType() {
        return new RunType();
    }

    /**
     * Create an instance of {@link TabType }
     * 
     */
    public TabType createTabType() {
        return new TabType();
    }

    /**
     * Create an instance of {@link FormGroupType }
     * 
     */
    public FormGroupType createFormGroupType() {
        return new FormGroupType();
    }

    /**
     * Create an instance of {@link StyleType }
     * 
     */
    public StyleType createStyleType() {
        return new StyleType();
    }

    /**
     * Create an instance of {@link AltType }
     * 
     */
    public AltType createAltType() {
        return new AltType();
    }

    /**
     * Create an instance of {@link LineType }
     * 
     */
    public LineType createLineType() {
        return new LineType();
    }

    /**
     * Create an instance of {@link DdType }
     * 
     */
    public DdType createDdType() {
        return new DdType();
    }

    /**
     * Create an instance of {@link RulerType }
     * 
     */
    public RulerType createRulerType() {
        return new RulerType();
    }

    /**
     * Create an instance of {@link CharType }
     * 
     */
    public CharType createCharType() {
        return new CharType();
    }

    /**
     * Create an instance of {@link FillGraphicsType }
     * 
     */
    public FillGraphicsType createFillGraphicsType() {
        return new FillGraphicsType();
    }

    /**
     * Create an instance of {@link RcType }
     * 
     */
    public RcType createRcType() {
        return new RcType();
    }

    /**
     * Create an instance of {@link StyleTableType }
     * 
     */
    public StyleTableType createStyleTableType() {
        return new StyleTableType();
    }

    /**
     * Create an instance of {@link ShapeType }
     * 
     */
    public ShapeType createShapeType() {
        return new ShapeType();
    }

    /**
     * Create an instance of {@link ColumnType }
     * 
     */
    public ColumnType createColumnType() {
        return new ColumnType();
    }

    /**
     * Create an instance of {@link BulletType }
     * 
     */
    public BulletType createBulletType() {
        return new BulletType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link FrameType }
     * 
     */
    public FrameType createFrameType() {
        return new FrameType();
    }

    /**
     * Create an instance of {@link GridTableType }
     * 
     */
    public GridTableType createGridTableType() {
        return new GridTableType();
    }

    /**
     * Create an instance of {@link FieldCodeType }
     * 
     */
    public FieldCodeType createFieldCodeType() {
        return new FieldCodeType();
    }

    /**
     * Create an instance of {@link SpaceType }
     * 
     */
    public SpaceType createSpaceType() {
        return new SpaceType();
    }

    /**
     * Create an instance of {@link TabPositionType }
     * 
     */
    public TabPositionType createTabPositionType() {
        return new TabPositionType();
    }

    /**
     * Create an instance of {@link HeaderFooterType }
     * 
     */
    public HeaderFooterType createHeaderFooterType() {
        return new HeaderFooterType();
    }

    /**
     * Create an instance of {@link CheckBoxType }
     * 
     */
    public CheckBoxType createCheckBoxType() {
        return new CheckBoxType();
    }

    /**
     * Create an instance of {@link TableType }
     * 
     */
    public TableType createTableType() {
        return new TableType();
    }

    /**
     * Create an instance of {@link WordType }
     * 
     */
    public WordType createWordType() {
        return new WordType();
    }

    /**
     * Create an instance of {@link NlType }
     * 
     */
    public NlType createNlType() {
        return new NlType();
    }

    /**
     * Create an instance of {@link LnType }
     * 
     */
    public LnType createLnType() {
        return new LnType();
    }

    /**
     * Create an instance of {@link InputLineType }
     * 
     */
    public InputLineType createInputLineType() {
        return new InputLineType();
    }

    /**
     * Create an instance of {@link CircleTextType }
     * 
     */
    public CircleTextType createCircleTextType() {
        return new CircleTextType();
    }

    /**
     * Create an instance of {@link PicType }
     * 
     */
    public PicType createPicType() {
        return new PicType();
    }

    /**
     * Create an instance of {@link DropCapType }
     * 
     */
    public DropCapType createDropCapType() {
        return new DropCapType();
    }

    /**
     * Create an instance of {@link PageDescType }
     * 
     */
    public PageDescType createPageDescType() {
        return new PageDescType();
    }

    /**
     * Create an instance of {@link CellType }
     * 
     */
    public CellType createCellType() {
        return new CellType();
    }

    /**
     * Create an instance of {@link TheoreticalPageType }
     * 
     */
    public TheoreticalPageType createTheoreticalPageType() {
        return new TheoreticalPageType();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link SectionType }
     * 
     */
    public SectionType createSectionType() {
        return new SectionType();
    }

    /**
     * Create an instance of {@link ParaType }
     * 
     */
    public ParaType createParaType() {
        return new ParaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rightBorder", scope = FillGraphicsType.class)
    public JAXBElement<LineType> createFillGraphicsTypeRightBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeRightBorder_QNAME, LineType.class, FillGraphicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "leftBorder", scope = FillGraphicsType.class)
    public JAXBElement<LineType> createFillGraphicsTypeLeftBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeLeftBorder_QNAME, LineType.class, FillGraphicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "topBorder", scope = FillGraphicsType.class)
    public JAXBElement<LineType> createFillGraphicsTypeTopBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeTopBorder_QNAME, LineType.class, FillGraphicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bottomBorder", scope = FillGraphicsType.class)
    public JAXBElement<LineType> createFillGraphicsTypeBottomBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeBottomBorder_QNAME, LineType.class, FillGraphicsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rightBorder", scope = RunType.class)
    public JAXBElement<LineType> createRunTypeRightBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeRightBorder_QNAME, LineType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = RunType.class)
    public JAXBElement<TabPositionType> createRunTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "circleText", scope = RunType.class)
    public JAXBElement<CircleTextType> createRunTypeCircleText(CircleTextType value) {
        return new JAXBElement<CircleTextType>(_RunTypeCircleText_QNAME, CircleTextType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "topBorder", scope = RunType.class)
    public JAXBElement<LineType> createRunTypeTopBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeTopBorder_QNAME, LineType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "formGroup", scope = RunType.class)
    public JAXBElement<FormGroupType> createRunTypeFormGroup(FormGroupType value) {
        return new JAXBElement<FormGroupType>(_RunTypeFormGroup_QNAME, FormGroupType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = RunType.class)
    public JAXBElement<NlType> createRunTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "checkBox", scope = RunType.class)
    public JAXBElement<CheckBoxType> createRunTypeCheckBox(CheckBoxType value) {
        return new JAXBElement<CheckBoxType>(_RunTypeCheckBox_QNAME, CheckBoxType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bottomBorder", scope = RunType.class)
    public JAXBElement<LineType> createRunTypeBottomBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeBottomBorder_QNAME, LineType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fieldCode", scope = RunType.class)
    public JAXBElement<FieldCodeType> createRunTypeFieldCode(FieldCodeType value) {
        return new JAXBElement<FieldCodeType>(_RunTypeFieldCode_QNAME, FieldCodeType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = RunType.class)
    public JAXBElement<CharType> createRunTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "leftBorder", scope = RunType.class)
    public JAXBElement<LineType> createRunTypeLeftBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeLeftBorder_QNAME, LineType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "inputLine", scope = RunType.class)
    public JAXBElement<InputLineType> createRunTypeInputLine(InputLineType value) {
        return new JAXBElement<InputLineType>(_RunTypeInputLine_QNAME, InputLineType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillGraphicsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fillGraphics", scope = RunType.class)
    public JAXBElement<FillGraphicsType> createRunTypeFillGraphics(FillGraphicsType value) {
        return new JAXBElement<FillGraphicsType>(_RunTypeFillGraphics_QNAME, FillGraphicsType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = RunType.class)
    public JAXBElement<SpaceType> createRunTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "wd", scope = RunType.class)
    public JAXBElement<WordType> createRunTypeWd(WordType value) {
        return new JAXBElement<WordType>(_RunTypeWd_QNAME, WordType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = RunType.class)
    public JAXBElement<RunType> createRunTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = RunType.class)
    public JAXBElement<AltType> createRunTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "link", scope = RunType.class)
    public JAXBElement<LinkType> createRunTypeLink(LinkType value) {
        return new JAXBElement<LinkType>(_RunTypeLink_QNAME, LinkType.class, RunType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = LinkType.class)
    public JAXBElement<CharType> createLinkTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, LinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = LinkType.class)
    public JAXBElement<TabPositionType> createLinkTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, LinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = LinkType.class)
    public JAXBElement<NlType> createLinkTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, LinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = LinkType.class)
    public JAXBElement<SpaceType> createLinkTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, LinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "wd", scope = LinkType.class)
    public JAXBElement<WordType> createLinkTypeWd(WordType value) {
        return new JAXBElement<WordType>(_RunTypeWd_QNAME, WordType.class, LinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = LinkType.class)
    public JAXBElement<RunType> createLinkTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, LinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = LinkType.class)
    public JAXBElement<AltType> createLinkTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, LinkType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rightBorder", scope = ParaType.class)
    public JAXBElement<LineType> createParaTypeRightBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeRightBorder_QNAME, LineType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = ParaType.class)
    public JAXBElement<TabPositionType> createParaTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "circleText", scope = ParaType.class)
    public JAXBElement<CircleTextType> createParaTypeCircleText(CircleTextType value) {
        return new JAXBElement<CircleTextType>(_RunTypeCircleText_QNAME, CircleTextType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "topBorder", scope = ParaType.class)
    public JAXBElement<LineType> createParaTypeTopBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeTopBorder_QNAME, LineType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "formGroup", scope = ParaType.class)
    public JAXBElement<FormGroupType> createParaTypeFormGroup(FormGroupType value) {
        return new JAXBElement<FormGroupType>(_RunTypeFormGroup_QNAME, FormGroupType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = ParaType.class)
    public JAXBElement<NlType> createParaTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulletType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bullet", scope = ParaType.class)
    public JAXBElement<BulletType> createParaTypeBullet(BulletType value) {
        return new JAXBElement<BulletType>(_ParaTypeBullet_QNAME, BulletType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "checkBox", scope = ParaType.class)
    public JAXBElement<CheckBoxType> createParaTypeCheckBox(CheckBoxType value) {
        return new JAXBElement<CheckBoxType>(_RunTypeCheckBox_QNAME, CheckBoxType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bottomBorder", scope = ParaType.class)
    public JAXBElement<LineType> createParaTypeBottomBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeBottomBorder_QNAME, LineType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fieldCode", scope = ParaType.class)
    public JAXBElement<FieldCodeType> createParaTypeFieldCode(FieldCodeType value) {
        return new JAXBElement<FieldCodeType>(_RunTypeFieldCode_QNAME, FieldCodeType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = ParaType.class)
    public JAXBElement<CharType> createParaTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "leftBorder", scope = ParaType.class)
    public JAXBElement<LineType> createParaTypeLeftBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeLeftBorder_QNAME, LineType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropCapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "dropCap", scope = ParaType.class)
    public JAXBElement<DropCapType> createParaTypeDropCap(DropCapType value) {
        return new JAXBElement<DropCapType>(_ParaTypeDropCap_QNAME, DropCapType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "inputLine", scope = ParaType.class)
    public JAXBElement<InputLineType> createParaTypeInputLine(InputLineType value) {
        return new JAXBElement<InputLineType>(_RunTypeInputLine_QNAME, InputLineType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillGraphicsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fillGraphics", scope = ParaType.class)
    public JAXBElement<FillGraphicsType> createParaTypeFillGraphics(FillGraphicsType value) {
        return new JAXBElement<FillGraphicsType>(_RunTypeFillGraphics_QNAME, FillGraphicsType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ln", scope = ParaType.class)
    public JAXBElement<LnType> createParaTypeLn(LnType value) {
        return new JAXBElement<LnType>(_ParaTypeLn_QNAME, LnType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = ParaType.class)
    public JAXBElement<SpaceType> createParaTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "wd", scope = ParaType.class)
    public JAXBElement<WordType> createParaTypeWd(WordType value) {
        return new JAXBElement<WordType>(_RunTypeWd_QNAME, WordType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = ParaType.class)
    public JAXBElement<RunType> createParaTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tabs", scope = ParaType.class)
    public JAXBElement<TabType> createParaTypeTabs(TabType value) {
        return new JAXBElement<TabType>(_ParaTypeTabs_QNAME, TabType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = ParaType.class)
    public JAXBElement<AltType> createParaTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "link", scope = ParaType.class)
    public JAXBElement<LinkType> createParaTypeLink(LinkType value) {
        return new JAXBElement<LinkType>(_RunTypeLink_QNAME, LinkType.class, ParaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = LnType.class)
    public JAXBElement<TabPositionType> createLnTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "circleText", scope = LnType.class)
    public JAXBElement<CircleTextType> createLnTypeCircleText(CircleTextType value) {
        return new JAXBElement<CircleTextType>(_RunTypeCircleText_QNAME, CircleTextType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "formGroup", scope = LnType.class)
    public JAXBElement<FormGroupType> createLnTypeFormGroup(FormGroupType value) {
        return new JAXBElement<FormGroupType>(_RunTypeFormGroup_QNAME, FormGroupType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = LnType.class)
    public JAXBElement<NlType> createLnTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "checkBox", scope = LnType.class)
    public JAXBElement<CheckBoxType> createLnTypeCheckBox(CheckBoxType value) {
        return new JAXBElement<CheckBoxType>(_RunTypeCheckBox_QNAME, CheckBoxType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fieldCode", scope = LnType.class)
    public JAXBElement<FieldCodeType> createLnTypeFieldCode(FieldCodeType value) {
        return new JAXBElement<FieldCodeType>(_RunTypeFieldCode_QNAME, FieldCodeType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = LnType.class)
    public JAXBElement<CharType> createLnTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "inputLine", scope = LnType.class)
    public JAXBElement<InputLineType> createLnTypeInputLine(InputLineType value) {
        return new JAXBElement<InputLineType>(_RunTypeInputLine_QNAME, InputLineType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillGraphicsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fillGraphics", scope = LnType.class)
    public JAXBElement<FillGraphicsType> createLnTypeFillGraphics(FillGraphicsType value) {
        return new JAXBElement<FillGraphicsType>(_RunTypeFillGraphics_QNAME, FillGraphicsType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = LnType.class)
    public JAXBElement<SpaceType> createLnTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "wd", scope = LnType.class)
    public JAXBElement<WordType> createLnTypeWd(WordType value) {
        return new JAXBElement<WordType>(_RunTypeWd_QNAME, WordType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = LnType.class)
    public JAXBElement<RunType> createLnTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = LnType.class)
    public JAXBElement<AltType> createLnTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "link", scope = LnType.class)
    public JAXBElement<LinkType> createLnTypeLink(LinkType value) {
        return new JAXBElement<LinkType>(_RunTypeLink_QNAME, LinkType.class, LnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rightBorder", scope = FormGroupType.class)
    public JAXBElement<LineType> createFormGroupTypeRightBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeRightBorder_QNAME, LineType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = FormGroupType.class)
    public JAXBElement<TabPositionType> createFormGroupTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "circleText", scope = FormGroupType.class)
    public JAXBElement<CircleTextType> createFormGroupTypeCircleText(CircleTextType value) {
        return new JAXBElement<CircleTextType>(_RunTypeCircleText_QNAME, CircleTextType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "topBorder", scope = FormGroupType.class)
    public JAXBElement<LineType> createFormGroupTypeTopBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeTopBorder_QNAME, LineType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "formGroup", scope = FormGroupType.class)
    public JAXBElement<FormGroupType> createFormGroupTypeFormGroup(FormGroupType value) {
        return new JAXBElement<FormGroupType>(_RunTypeFormGroup_QNAME, FormGroupType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = FormGroupType.class)
    public JAXBElement<NlType> createFormGroupTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rulerline", scope = FormGroupType.class)
    public JAXBElement<RulerType> createFormGroupTypeRulerline(RulerType value) {
        return new JAXBElement<RulerType>(_FormGroupTypeRulerline_QNAME, RulerType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "checkBox", scope = FormGroupType.class)
    public JAXBElement<CheckBoxType> createFormGroupTypeCheckBox(CheckBoxType value) {
        return new JAXBElement<CheckBoxType>(_RunTypeCheckBox_QNAME, CheckBoxType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bottomBorder", scope = FormGroupType.class)
    public JAXBElement<LineType> createFormGroupTypeBottomBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeBottomBorder_QNAME, LineType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = FormGroupType.class)
    public JAXBElement<CharType> createFormGroupTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "leftBorder", scope = FormGroupType.class)
    public JAXBElement<LineType> createFormGroupTypeLeftBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeLeftBorder_QNAME, LineType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "inputLine", scope = FormGroupType.class)
    public JAXBElement<InputLineType> createFormGroupTypeInputLine(InputLineType value) {
        return new JAXBElement<InputLineType>(_RunTypeInputLine_QNAME, InputLineType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillGraphicsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fillGraphics", scope = FormGroupType.class)
    public JAXBElement<FillGraphicsType> createFormGroupTypeFillGraphics(FillGraphicsType value) {
        return new JAXBElement<FillGraphicsType>(_RunTypeFillGraphics_QNAME, FillGraphicsType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ln", scope = FormGroupType.class)
    public JAXBElement<LnType> createFormGroupTypeLn(LnType value) {
        return new JAXBElement<LnType>(_ParaTypeLn_QNAME, LnType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = FormGroupType.class)
    public JAXBElement<SpaceType> createFormGroupTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "wd", scope = FormGroupType.class)
    public JAXBElement<WordType> createFormGroupTypeWd(WordType value) {
        return new JAXBElement<WordType>(_RunTypeWd_QNAME, WordType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = FormGroupType.class)
    public JAXBElement<RunType> createFormGroupTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = FormGroupType.class)
    public JAXBElement<AltType> createFormGroupTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, FormGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rightBorder", scope = CircleTextType.class)
    public JAXBElement<LineType> createCircleTextTypeRightBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeRightBorder_QNAME, LineType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = CircleTextType.class)
    public JAXBElement<CharType> createCircleTextTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "leftBorder", scope = CircleTextType.class)
    public JAXBElement<LineType> createCircleTextTypeLeftBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeLeftBorder_QNAME, LineType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = CircleTextType.class)
    public JAXBElement<TabPositionType> createCircleTextTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "topBorder", scope = CircleTextType.class)
    public JAXBElement<LineType> createCircleTextTypeTopBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeTopBorder_QNAME, LineType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = CircleTextType.class)
    public JAXBElement<NlType> createCircleTextTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = CircleTextType.class)
    public JAXBElement<SpaceType> createCircleTextTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "wd", scope = CircleTextType.class)
    public JAXBElement<WordType> createCircleTextTypeWd(WordType value) {
        return new JAXBElement<WordType>(_RunTypeWd_QNAME, WordType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = CircleTextType.class)
    public JAXBElement<RunType> createCircleTextTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bottomBorder", scope = CircleTextType.class)
    public JAXBElement<LineType> createCircleTextTypeBottomBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeBottomBorder_QNAME, LineType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = CircleTextType.class)
    public JAXBElement<AltType> createCircleTextTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, CircleTextType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "fieldCode", scope = WordType.class)
    public JAXBElement<FieldCodeType> createWordTypeFieldCode(FieldCodeType value) {
        return new JAXBElement<FieldCodeType>(_RunTypeFieldCode_QNAME, FieldCodeType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = WordType.class)
    public JAXBElement<CharType> createWordTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "inputLine", scope = WordType.class)
    public JAXBElement<InputLineType> createWordTypeInputLine(InputLineType value) {
        return new JAXBElement<InputLineType>(_RunTypeInputLine_QNAME, InputLineType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "circleText", scope = WordType.class)
    public JAXBElement<CircleTextType> createWordTypeCircleText(CircleTextType value) {
        return new JAXBElement<CircleTextType>(_RunTypeCircleText_QNAME, CircleTextType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = WordType.class)
    public JAXBElement<TabPositionType> createWordTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "formGroup", scope = WordType.class)
    public JAXBElement<FormGroupType> createWordTypeFormGroup(FormGroupType value) {
        return new JAXBElement<FormGroupType>(_RunTypeFormGroup_QNAME, FormGroupType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = WordType.class)
    public JAXBElement<NlType> createWordTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = WordType.class)
    public JAXBElement<SpaceType> createWordTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = WordType.class)
    public JAXBElement<RunType> createWordTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "checkBox", scope = WordType.class)
    public JAXBElement<CheckBoxType> createWordTypeCheckBox(CheckBoxType value) {
        return new JAXBElement<CheckBoxType>(_RunTypeCheckBox_QNAME, CheckBoxType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = WordType.class)
    public JAXBElement<AltType> createWordTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "link", scope = WordType.class)
    public JAXBElement<LinkType> createWordTypeLink(LinkType value) {
        return new JAXBElement<LinkType>(_RunTypeLink_QNAME, LinkType.class, WordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rightBorder", scope = InputLineType.class)
    public JAXBElement<LineType> createInputLineTypeRightBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeRightBorder_QNAME, LineType.class, InputLineType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "leftBorder", scope = InputLineType.class)
    public JAXBElement<LineType> createInputLineTypeLeftBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeLeftBorder_QNAME, LineType.class, InputLineType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "topBorder", scope = InputLineType.class)
    public JAXBElement<LineType> createInputLineTypeTopBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeTopBorder_QNAME, LineType.class, InputLineType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = InputLineType.class)
    public JAXBElement<RunType> createInputLineTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, InputLineType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bottomBorder", scope = InputLineType.class)
    public JAXBElement<LineType> createInputLineTypeBottomBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeBottomBorder_QNAME, LineType.class, InputLineType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "rightBorder", scope = CheckBoxType.class)
    public JAXBElement<LineType> createCheckBoxTypeRightBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeRightBorder_QNAME, LineType.class, CheckBoxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "leftBorder", scope = CheckBoxType.class)
    public JAXBElement<LineType> createCheckBoxTypeLeftBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeLeftBorder_QNAME, LineType.class, CheckBoxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "topBorder", scope = CheckBoxType.class)
    public JAXBElement<LineType> createCheckBoxTypeTopBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeTopBorder_QNAME, LineType.class, CheckBoxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "bottomBorder", scope = CheckBoxType.class)
    public JAXBElement<LineType> createCheckBoxTypeBottomBorder(LineType value) {
        return new JAXBElement<LineType>(_FillGraphicsTypeBottomBorder_QNAME, LineType.class, CheckBoxType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "ch", scope = FieldCodeType.class)
    public JAXBElement<CharType> createFieldCodeTypeCh(CharType value) {
        return new JAXBElement<CharType>(_RunTypeCh_QNAME, CharType.class, FieldCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "tab", scope = FieldCodeType.class)
    public JAXBElement<TabPositionType> createFieldCodeTypeTab(TabPositionType value) {
        return new JAXBElement<TabPositionType>(_RunTypeTab_QNAME, TabPositionType.class, FieldCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "nl", scope = FieldCodeType.class)
    public JAXBElement<NlType> createFieldCodeTypeNl(NlType value) {
        return new JAXBElement<NlType>(_RunTypeNl_QNAME, NlType.class, FieldCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "space", scope = FieldCodeType.class)
    public JAXBElement<SpaceType> createFieldCodeTypeSpace(SpaceType value) {
        return new JAXBElement<SpaceType>(_RunTypeSpace_QNAME, SpaceType.class, FieldCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "wd", scope = FieldCodeType.class)
    public JAXBElement<WordType> createFieldCodeTypeWd(WordType value) {
        return new JAXBElement<WordType>(_RunTypeWd_QNAME, WordType.class, FieldCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "run", scope = FieldCodeType.class)
    public JAXBElement<RunType> createFieldCodeTypeRun(RunType value) {
        return new JAXBElement<RunType>(_RunTypeRun_QNAME, RunType.class, FieldCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.scansoft.com/omnipage/xml/ssdoc-schema3.xsd", name = "alt", scope = FieldCodeType.class)
    public JAXBElement<AltType> createFieldCodeTypeAlt(AltType value) {
        return new JAXBElement<AltType>(_RunTypeAlt_QNAME, AltType.class, FieldCodeType.class, value);
    }

}
