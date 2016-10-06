/**
 */
package xhtml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import xhtml.AContent;
import xhtml.AType;
import xhtml.AbbrType;
import xhtml.AcronymType;
import xhtml.AddressType;
import xhtml.AreaType;
import xhtml.BType;
import xhtml.BaseType;
import xhtml.BdoType;
import xhtml.BigType;
import xhtml.Block;
import xhtml.BlockquoteType;
import xhtml.BodyType;
import xhtml.BrType;
import xhtml.ButtonContent;
import xhtml.ButtonType;
import xhtml.CaptionType;
import xhtml.CiteType;
import xhtml.CodeType;
import xhtml.ColType;
import xhtml.ColgroupType;
import xhtml.DdType;
import xhtml.DelType;
import xhtml.DfnType;
import xhtml.DivType;
import xhtml.DlType;
import xhtml.DocumentRoot;
import xhtml.DtType;
import xhtml.EmType;
import xhtml.FieldsetType;
import xhtml.Flow;
import xhtml.FormContent;
import xhtml.FormType;
import xhtml.H1Type;
import xhtml.H2Type;
import xhtml.H3Type;
import xhtml.H4Type;
import xhtml.H5Type;
import xhtml.H6Type;
import xhtml.HeadType;
import xhtml.HrType;
import xhtml.HtmlType;
import xhtml.IType;
import xhtml.ImgType;
import xhtml.Inline;
import xhtml.InputType1;
import xhtml.InsType;
import xhtml.KbdType;
import xhtml.LabelType;
import xhtml.LegendType;
import xhtml.LiType;
import xhtml.LinkType;
import xhtml.MapType;
import xhtml.MetaType;
import xhtml.NoscriptType;
import xhtml.ObjectType;
import xhtml.OlType;
import xhtml.OptgroupType;
import xhtml.OptionType;
import xhtml.PType;
import xhtml.ParamType;
import xhtml.PreContent;
import xhtml.PreType;
import xhtml.QType;
import xhtml.SampType;
import xhtml.ScriptType;
import xhtml.SelectType;
import xhtml.SmallType;
import xhtml.SpanType;
import xhtml.StrongType;
import xhtml.StyleType;
import xhtml.SubType;
import xhtml.SupType;
import xhtml.TableType;
import xhtml.TbodyType;
import xhtml.TdType;
import xhtml.TextareaType;
import xhtml.TfootType;
import xhtml.ThType;
import xhtml.TheadType;
import xhtml.TitleType;
import xhtml.TrType;
import xhtml.TtType;
import xhtml.UlType;
import xhtml.VarType;
import xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xhtml.XhtmlPackage
 * @generated
 */
public class XhtmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XhtmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XhtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XhtmlSwitch<Adapter> modelSwitch =
		new XhtmlSwitch<Adapter>() {
			@Override
			public Adapter caseAbbrType(AbbrType object) {
				return createAbbrTypeAdapter();
			}
			@Override
			public Adapter caseAContent(AContent object) {
				return createAContentAdapter();
			}
			@Override
			public Adapter caseAcronymType(AcronymType object) {
				return createAcronymTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseAType(AType object) {
				return createATypeAdapter();
			}
			@Override
			public Adapter caseBaseType(BaseType object) {
				return createBaseTypeAdapter();
			}
			@Override
			public Adapter caseBdoType(BdoType object) {
				return createBdoTypeAdapter();
			}
			@Override
			public Adapter caseBigType(BigType object) {
				return createBigTypeAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseBlockquoteType(BlockquoteType object) {
				return createBlockquoteTypeAdapter();
			}
			@Override
			public Adapter caseBodyType(BodyType object) {
				return createBodyTypeAdapter();
			}
			@Override
			public Adapter caseBrType(BrType object) {
				return createBrTypeAdapter();
			}
			@Override
			public Adapter caseBType(BType object) {
				return createBTypeAdapter();
			}
			@Override
			public Adapter caseButtonContent(ButtonContent object) {
				return createButtonContentAdapter();
			}
			@Override
			public Adapter caseButtonType(ButtonType object) {
				return createButtonTypeAdapter();
			}
			@Override
			public Adapter caseCaptionType(CaptionType object) {
				return createCaptionTypeAdapter();
			}
			@Override
			public Adapter caseCiteType(CiteType object) {
				return createCiteTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseColgroupType(ColgroupType object) {
				return createColgroupTypeAdapter();
			}
			@Override
			public Adapter caseColType(ColType object) {
				return createColTypeAdapter();
			}
			@Override
			public Adapter caseDdType(DdType object) {
				return createDdTypeAdapter();
			}
			@Override
			public Adapter caseDelType(DelType object) {
				return createDelTypeAdapter();
			}
			@Override
			public Adapter caseDfnType(DfnType object) {
				return createDfnTypeAdapter();
			}
			@Override
			public Adapter caseDivType(DivType object) {
				return createDivTypeAdapter();
			}
			@Override
			public Adapter caseDlType(DlType object) {
				return createDlTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDtType(DtType object) {
				return createDtTypeAdapter();
			}
			@Override
			public Adapter caseEmType(EmType object) {
				return createEmTypeAdapter();
			}
			@Override
			public Adapter caseFieldsetType(FieldsetType object) {
				return createFieldsetTypeAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseFormContent(FormContent object) {
				return createFormContentAdapter();
			}
			@Override
			public Adapter caseFormType(FormType object) {
				return createFormTypeAdapter();
			}
			@Override
			public Adapter caseH1Type(H1Type object) {
				return createH1TypeAdapter();
			}
			@Override
			public Adapter caseH2Type(H2Type object) {
				return createH2TypeAdapter();
			}
			@Override
			public Adapter caseH3Type(H3Type object) {
				return createH3TypeAdapter();
			}
			@Override
			public Adapter caseH4Type(H4Type object) {
				return createH4TypeAdapter();
			}
			@Override
			public Adapter caseH5Type(H5Type object) {
				return createH5TypeAdapter();
			}
			@Override
			public Adapter caseH6Type(H6Type object) {
				return createH6TypeAdapter();
			}
			@Override
			public Adapter caseHeadType(HeadType object) {
				return createHeadTypeAdapter();
			}
			@Override
			public Adapter caseHrType(HrType object) {
				return createHrTypeAdapter();
			}
			@Override
			public Adapter caseHtmlType(HtmlType object) {
				return createHtmlTypeAdapter();
			}
			@Override
			public Adapter caseImgType(ImgType object) {
				return createImgTypeAdapter();
			}
			@Override
			public Adapter caseInline(Inline object) {
				return createInlineAdapter();
			}
			@Override
			public Adapter caseInputType1(InputType1 object) {
				return createInputType1Adapter();
			}
			@Override
			public Adapter caseInsType(InsType object) {
				return createInsTypeAdapter();
			}
			@Override
			public Adapter caseIType(IType object) {
				return createITypeAdapter();
			}
			@Override
			public Adapter caseKbdType(KbdType object) {
				return createKbdTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLegendType(LegendType object) {
				return createLegendTypeAdapter();
			}
			@Override
			public Adapter caseLinkType(LinkType object) {
				return createLinkTypeAdapter();
			}
			@Override
			public Adapter caseLiType(LiType object) {
				return createLiTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseMetaType(MetaType object) {
				return createMetaTypeAdapter();
			}
			@Override
			public Adapter caseNoscriptType(NoscriptType object) {
				return createNoscriptTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseOlType(OlType object) {
				return createOlTypeAdapter();
			}
			@Override
			public Adapter caseOptgroupType(OptgroupType object) {
				return createOptgroupTypeAdapter();
			}
			@Override
			public Adapter caseOptionType(OptionType object) {
				return createOptionTypeAdapter();
			}
			@Override
			public Adapter caseParamType(ParamType object) {
				return createParamTypeAdapter();
			}
			@Override
			public Adapter casePreContent(PreContent object) {
				return createPreContentAdapter();
			}
			@Override
			public Adapter casePreType(PreType object) {
				return createPreTypeAdapter();
			}
			@Override
			public Adapter casePType(PType object) {
				return createPTypeAdapter();
			}
			@Override
			public Adapter caseQType(QType object) {
				return createQTypeAdapter();
			}
			@Override
			public Adapter caseSampType(SampType object) {
				return createSampTypeAdapter();
			}
			@Override
			public Adapter caseScriptType(ScriptType object) {
				return createScriptTypeAdapter();
			}
			@Override
			public Adapter caseSelectType(SelectType object) {
				return createSelectTypeAdapter();
			}
			@Override
			public Adapter caseSmallType(SmallType object) {
				return createSmallTypeAdapter();
			}
			@Override
			public Adapter caseSpanType(SpanType object) {
				return createSpanTypeAdapter();
			}
			@Override
			public Adapter caseStrongType(StrongType object) {
				return createStrongTypeAdapter();
			}
			@Override
			public Adapter caseStyleType(StyleType object) {
				return createStyleTypeAdapter();
			}
			@Override
			public Adapter caseSubType(SubType object) {
				return createSubTypeAdapter();
			}
			@Override
			public Adapter caseSupType(SupType object) {
				return createSupTypeAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseTbodyType(TbodyType object) {
				return createTbodyTypeAdapter();
			}
			@Override
			public Adapter caseTdType(TdType object) {
				return createTdTypeAdapter();
			}
			@Override
			public Adapter caseTextareaType(TextareaType object) {
				return createTextareaTypeAdapter();
			}
			@Override
			public Adapter caseTfootType(TfootType object) {
				return createTfootTypeAdapter();
			}
			@Override
			public Adapter caseTheadType(TheadType object) {
				return createTheadTypeAdapter();
			}
			@Override
			public Adapter caseThType(ThType object) {
				return createThTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseTrType(TrType object) {
				return createTrTypeAdapter();
			}
			@Override
			public Adapter caseTtType(TtType object) {
				return createTtTypeAdapter();
			}
			@Override
			public Adapter caseUlType(UlType object) {
				return createUlTypeAdapter();
			}
			@Override
			public Adapter caseVarType(VarType object) {
				return createVarTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xhtml.AbbrType <em>Abbr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.AbbrType
	 * @generated
	 */
	public Adapter createAbbrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.AContent <em>AContent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.AContent
	 * @generated
	 */
	public Adapter createAContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.AcronymType <em>Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.AcronymType
	 * @generated
	 */
	public Adapter createAcronymTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.AType
	 * @generated
	 */
	public Adapter createATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.BaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.BaseType
	 * @generated
	 */
	public Adapter createBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.BdoType <em>Bdo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.BdoType
	 * @generated
	 */
	public Adapter createBdoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.BigType <em>Big Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.BigType
	 * @generated
	 */
	public Adapter createBigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.BlockquoteType <em>Blockquote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.BlockquoteType
	 * @generated
	 */
	public Adapter createBlockquoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.BodyType
	 * @generated
	 */
	public Adapter createBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.BrType <em>Br Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.BrType
	 * @generated
	 */
	public Adapter createBrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.BType
	 * @generated
	 */
	public Adapter createBTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ButtonContent <em>Button Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ButtonContent
	 * @generated
	 */
	public Adapter createButtonContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ButtonType
	 * @generated
	 */
	public Adapter createButtonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.CaptionType
	 * @generated
	 */
	public Adapter createCaptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.CiteType <em>Cite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.CiteType
	 * @generated
	 */
	public Adapter createCiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ColgroupType
	 * @generated
	 */
	public Adapter createColgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ColType
	 * @generated
	 */
	public Adapter createColTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.DdType <em>Dd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.DdType
	 * @generated
	 */
	public Adapter createDdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.DelType <em>Del Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.DelType
	 * @generated
	 */
	public Adapter createDelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.DfnType <em>Dfn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.DfnType
	 * @generated
	 */
	public Adapter createDfnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.DivType <em>Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.DivType
	 * @generated
	 */
	public Adapter createDivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.DlType <em>Dl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.DlType
	 * @generated
	 */
	public Adapter createDlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.DtType <em>Dt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.DtType
	 * @generated
	 */
	public Adapter createDtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.EmType <em>Em Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.EmType
	 * @generated
	 */
	public Adapter createEmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.FieldsetType <em>Fieldset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.FieldsetType
	 * @generated
	 */
	public Adapter createFieldsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.FormContent <em>Form Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.FormContent
	 * @generated
	 */
	public Adapter createFormContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.FormType <em>Form Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.FormType
	 * @generated
	 */
	public Adapter createFormTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.H1Type <em>H1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.H1Type
	 * @generated
	 */
	public Adapter createH1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.H2Type <em>H2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.H2Type
	 * @generated
	 */
	public Adapter createH2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.H3Type <em>H3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.H3Type
	 * @generated
	 */
	public Adapter createH3TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.H4Type <em>H4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.H4Type
	 * @generated
	 */
	public Adapter createH4TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.H5Type <em>H5 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.H5Type
	 * @generated
	 */
	public Adapter createH5TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.H6Type <em>H6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.H6Type
	 * @generated
	 */
	public Adapter createH6TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.HeadType <em>Head Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.HeadType
	 * @generated
	 */
	public Adapter createHeadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.HrType <em>Hr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.HrType
	 * @generated
	 */
	public Adapter createHrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.HtmlType <em>Html Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.HtmlType
	 * @generated
	 */
	public Adapter createHtmlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ImgType <em>Img Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ImgType
	 * @generated
	 */
	public Adapter createImgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.Inline
	 * @generated
	 */
	public Adapter createInlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.InputType1 <em>Input Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.InputType1
	 * @generated
	 */
	public Adapter createInputType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.InsType <em>Ins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.InsType
	 * @generated
	 */
	public Adapter createInsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.IType <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.IType
	 * @generated
	 */
	public Adapter createITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.KbdType <em>Kbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.KbdType
	 * @generated
	 */
	public Adapter createKbdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.LegendType <em>Legend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.LegendType
	 * @generated
	 */
	public Adapter createLegendTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.LinkType
	 * @generated
	 */
	public Adapter createLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.LiType <em>Li Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.LiType
	 * @generated
	 */
	public Adapter createLiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.MetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.MetaType
	 * @generated
	 */
	public Adapter createMetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.NoscriptType <em>Noscript Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.NoscriptType
	 * @generated
	 */
	public Adapter createNoscriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.OlType <em>Ol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.OlType
	 * @generated
	 */
	public Adapter createOlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.OptgroupType <em>Optgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.OptgroupType
	 * @generated
	 */
	public Adapter createOptgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.OptionType
	 * @generated
	 */
	public Adapter createOptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ParamType
	 * @generated
	 */
	public Adapter createParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.PreContent <em>Pre Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.PreContent
	 * @generated
	 */
	public Adapter createPreContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.PreType <em>Pre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.PreType
	 * @generated
	 */
	public Adapter createPreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.PType
	 * @generated
	 */
	public Adapter createPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.QType
	 * @generated
	 */
	public Adapter createQTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.SampType <em>Samp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.SampType
	 * @generated
	 */
	public Adapter createSampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ScriptType
	 * @generated
	 */
	public Adapter createScriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.SelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.SelectType
	 * @generated
	 */
	public Adapter createSelectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.SmallType <em>Small Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.SmallType
	 * @generated
	 */
	public Adapter createSmallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.SpanType
	 * @generated
	 */
	public Adapter createSpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.StrongType <em>Strong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.StrongType
	 * @generated
	 */
	public Adapter createStrongTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.StyleType
	 * @generated
	 */
	public Adapter createStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.SubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.SubType
	 * @generated
	 */
	public Adapter createSubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.SupType <em>Sup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.SupType
	 * @generated
	 */
	public Adapter createSupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TbodyType
	 * @generated
	 */
	public Adapter createTbodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TdType
	 * @generated
	 */
	public Adapter createTdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TextareaType <em>Textarea Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TextareaType
	 * @generated
	 */
	public Adapter createTextareaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TfootType
	 * @generated
	 */
	public Adapter createTfootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TheadType
	 * @generated
	 */
	public Adapter createTheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.ThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.ThType
	 * @generated
	 */
	public Adapter createThTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TrType
	 * @generated
	 */
	public Adapter createTrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.TtType <em>Tt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.TtType
	 * @generated
	 */
	public Adapter createTtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.UlType <em>Ul Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.UlType
	 * @generated
	 */
	public Adapter createUlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xhtml.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xhtml.VarType
	 * @generated
	 */
	public Adapter createVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XhtmlAdapterFactory
