// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datatablestestmodule.proxies;

/**
 * The context entity for the data table. Contains the configuration of the table.
 */
public class DataTableContextEntity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dataTableContextEntityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DataTablesTestModule.DataTableContextEntity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RefreshTable("RefreshTable"),
		XPath("XPath"),
		Gender("Gender"),
		FirstName("FirstName"),
		LastName("LastName"),
		DateTimeValue("DateTimeValue"),
		DateTimeLongValue("DateTimeLongValue"),
		Number("Number"),
		DateValue("DateValue"),
		DecimalValue("DecimalValue"),
		BooleanFilter("BooleanFilter"),
		ExportConfig("ExportConfig"),
		ExportXPath("ExportXPath"),
		DataTableContextEntity_Person_Current("DataTablesTestModule.DataTableContextEntity_Person_Current"),
		DataTableContextEntity_Country("DataTablesTestModule.DataTableContextEntity_Country"),
		DataTableContextEntity_Language("DataTablesTestModule.DataTableContextEntity_Language");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DataTableContextEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DataTablesTestModule.DataTableContextEntity"));
	}

	protected DataTableContextEntity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dataTableContextEntityMendixObject)
	{
		if (dataTableContextEntityMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DataTablesTestModule.DataTableContextEntity", dataTableContextEntityMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DataTablesTestModule.DataTableContextEntity");

		this.dataTableContextEntityMendixObject = dataTableContextEntityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DataTableContextEntity.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static datatablestestmodule.proxies.DataTableContextEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return datatablestestmodule.proxies.DataTableContextEntity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static datatablestestmodule.proxies.DataTableContextEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new datatablestestmodule.proxies.DataTableContextEntity(context, mendixObject);
	}

	public static datatablestestmodule.proxies.DataTableContextEntity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return datatablestestmodule.proxies.DataTableContextEntity.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of RefreshTable
	 */
	public final Boolean getRefreshTable()
	{
		return getRefreshTable(getContext());
	}

	/**
	 * @param context
	 * @return value of RefreshTable
	 */
	public final Boolean getRefreshTable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.RefreshTable.toString());
	}

	/**
	 * Set value of RefreshTable
	 * @param refreshtable
	 */
	public final void setRefreshTable(Boolean refreshtable)
	{
		setRefreshTable(getContext(), refreshtable);
	}

	/**
	 * Set value of RefreshTable
	 * @param context
	 * @param refreshtable
	 */
	public final void setRefreshTable(com.mendix.systemwideinterfaces.core.IContext context, Boolean refreshtable)
	{
		getMendixObject().setValue(context, MemberNames.RefreshTable.toString(), refreshtable);
	}

	/**
	 * @return value of XPath
	 */
	public final String getXPath()
	{
		return getXPath(getContext());
	}

	/**
	 * @param context
	 * @return value of XPath
	 */
	public final String getXPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.XPath.toString());
	}

	/**
	 * Set value of XPath
	 * @param xpath
	 */
	public final void setXPath(String xpath)
	{
		setXPath(getContext(), xpath);
	}

	/**
	 * Set value of XPath
	 * @param context
	 * @param xpath
	 */
	public final void setXPath(com.mendix.systemwideinterfaces.core.IContext context, String xpath)
	{
		getMendixObject().setValue(context, MemberNames.XPath.toString(), xpath);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final datatablestestmodule.proxies.Gender getGender()
	{
		return getGender(getContext());
	}

	/**
	 * @param context
	 * @return value of Gender
	 */
	public final datatablestestmodule.proxies.Gender getGender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Gender.toString());
		if (obj == null)
			return null;

		return datatablestestmodule.proxies.Gender.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final void setGender(datatablestestmodule.proxies.Gender gender)
	{
		setGender(getContext(), gender);
	}

	/**
	 * Set value of Gender
	 * @param context
	 * @param gender
	 */
	public final void setGender(com.mendix.systemwideinterfaces.core.IContext context, datatablestestmodule.proxies.Gender gender)
	{
		if (gender != null)
			getMendixObject().setValue(context, MemberNames.Gender.toString(), gender.toString());
		else
			getMendixObject().setValue(context, MemberNames.Gender.toString(), null);
	}

	/**
	 * @return value of FirstName
	 */
	public final String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of LastName
	 */
	public final String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of DateTimeValue
	 */
	public final java.util.Date getDateTimeValue()
	{
		return getDateTimeValue(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeValue
	 */
	public final java.util.Date getDateTimeValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateTimeValue.toString());
	}

	/**
	 * Set value of DateTimeValue
	 * @param datetimevalue
	 */
	public final void setDateTimeValue(java.util.Date datetimevalue)
	{
		setDateTimeValue(getContext(), datetimevalue);
	}

	/**
	 * Set value of DateTimeValue
	 * @param context
	 * @param datetimevalue
	 */
	public final void setDateTimeValue(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datetimevalue)
	{
		getMendixObject().setValue(context, MemberNames.DateTimeValue.toString(), datetimevalue);
	}

	/**
	 * @return value of DateTimeLongValue
	 */
	public final Long getDateTimeLongValue()
	{
		return getDateTimeLongValue(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeLongValue
	 */
	public final Long getDateTimeLongValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.DateTimeLongValue.toString());
	}

	/**
	 * Set value of DateTimeLongValue
	 * @param datetimelongvalue
	 */
	public final void setDateTimeLongValue(Long datetimelongvalue)
	{
		setDateTimeLongValue(getContext(), datetimelongvalue);
	}

	/**
	 * Set value of DateTimeLongValue
	 * @param context
	 * @param datetimelongvalue
	 */
	public final void setDateTimeLongValue(com.mendix.systemwideinterfaces.core.IContext context, Long datetimelongvalue)
	{
		getMendixObject().setValue(context, MemberNames.DateTimeLongValue.toString(), datetimelongvalue);
	}

	/**
	 * @return value of Number
	 */
	public final Long getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final Long getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(Long number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, Long number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * @return value of DateValue
	 */
	public final java.util.Date getDateValue()
	{
		return getDateValue(getContext());
	}

	/**
	 * @param context
	 * @return value of DateValue
	 */
	public final java.util.Date getDateValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateValue.toString());
	}

	/**
	 * Set value of DateValue
	 * @param datevalue
	 */
	public final void setDateValue(java.util.Date datevalue)
	{
		setDateValue(getContext(), datevalue);
	}

	/**
	 * Set value of DateValue
	 * @param context
	 * @param datevalue
	 */
	public final void setDateValue(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datevalue)
	{
		getMendixObject().setValue(context, MemberNames.DateValue.toString(), datevalue);
	}

	/**
	 * @return value of DecimalValue
	 */
	public final java.math.BigDecimal getDecimalValue()
	{
		return getDecimalValue(getContext());
	}

	/**
	 * @param context
	 * @return value of DecimalValue
	 */
	public final java.math.BigDecimal getDecimalValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.DecimalValue.toString());
	}

	/**
	 * Set value of DecimalValue
	 * @param decimalvalue
	 */
	public final void setDecimalValue(java.math.BigDecimal decimalvalue)
	{
		setDecimalValue(getContext(), decimalvalue);
	}

	/**
	 * Set value of DecimalValue
	 * @param context
	 * @param decimalvalue
	 */
	public final void setDecimalValue(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal decimalvalue)
	{
		getMendixObject().setValue(context, MemberNames.DecimalValue.toString(), decimalvalue);
	}

	/**
	 * Set value of BooleanFilter
	 * @param booleanfilter
	 */
	public final datatablestestmodule.proxies.BooleanFilter getBooleanFilter()
	{
		return getBooleanFilter(getContext());
	}

	/**
	 * @param context
	 * @return value of BooleanFilter
	 */
	public final datatablestestmodule.proxies.BooleanFilter getBooleanFilter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BooleanFilter.toString());
		if (obj == null)
			return null;

		return datatablestestmodule.proxies.BooleanFilter.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BooleanFilter
	 * @param booleanfilter
	 */
	public final void setBooleanFilter(datatablestestmodule.proxies.BooleanFilter booleanfilter)
	{
		setBooleanFilter(getContext(), booleanfilter);
	}

	/**
	 * Set value of BooleanFilter
	 * @param context
	 * @param booleanfilter
	 */
	public final void setBooleanFilter(com.mendix.systemwideinterfaces.core.IContext context, datatablestestmodule.proxies.BooleanFilter booleanfilter)
	{
		if (booleanfilter != null)
			getMendixObject().setValue(context, MemberNames.BooleanFilter.toString(), booleanfilter.toString());
		else
			getMendixObject().setValue(context, MemberNames.BooleanFilter.toString(), null);
	}

	/**
	 * @return value of ExportConfig
	 */
	public final String getExportConfig()
	{
		return getExportConfig(getContext());
	}

	/**
	 * @param context
	 * @return value of ExportConfig
	 */
	public final String getExportConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ExportConfig.toString());
	}

	/**
	 * Set value of ExportConfig
	 * @param exportconfig
	 */
	public final void setExportConfig(String exportconfig)
	{
		setExportConfig(getContext(), exportconfig);
	}

	/**
	 * Set value of ExportConfig
	 * @param context
	 * @param exportconfig
	 */
	public final void setExportConfig(com.mendix.systemwideinterfaces.core.IContext context, String exportconfig)
	{
		getMendixObject().setValue(context, MemberNames.ExportConfig.toString(), exportconfig);
	}

	/**
	 * @return value of ExportXPath
	 */
	public final String getExportXPath()
	{
		return getExportXPath(getContext());
	}

	/**
	 * @param context
	 * @return value of ExportXPath
	 */
	public final String getExportXPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ExportXPath.toString());
	}

	/**
	 * Set value of ExportXPath
	 * @param exportxpath
	 */
	public final void setExportXPath(String exportxpath)
	{
		setExportXPath(getContext(), exportxpath);
	}

	/**
	 * Set value of ExportXPath
	 * @param context
	 * @param exportxpath
	 */
	public final void setExportXPath(com.mendix.systemwideinterfaces.core.IContext context, String exportxpath)
	{
		getMendixObject().setValue(context, MemberNames.ExportXPath.toString(), exportxpath);
	}

	/**
	 * @return value of DataTableContextEntity_Person_Current
	 */
	public final datatablestestmodule.proxies.Person getDataTableContextEntity_Person_Current() throws com.mendix.core.CoreException
	{
		return getDataTableContextEntity_Person_Current(getContext());
	}

	/**
	 * @param context
	 * @return value of DataTableContextEntity_Person_Current
	 */
	public final datatablestestmodule.proxies.Person getDataTableContextEntity_Person_Current(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		datatablestestmodule.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DataTableContextEntity_Person_Current.toString());
		if (identifier != null)
			result = datatablestestmodule.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DataTableContextEntity_Person_Current
	 * @param datatablecontextentity_person_current
	 */
	public final void setDataTableContextEntity_Person_Current(datatablestestmodule.proxies.Person datatablecontextentity_person_current)
	{
		setDataTableContextEntity_Person_Current(getContext(), datatablecontextentity_person_current);
	}

	/**
	 * Set value of DataTableContextEntity_Person_Current
	 * @param context
	 * @param datatablecontextentity_person_current
	 */
	public final void setDataTableContextEntity_Person_Current(com.mendix.systemwideinterfaces.core.IContext context, datatablestestmodule.proxies.Person datatablecontextentity_person_current)
	{
		if (datatablecontextentity_person_current == null)
			getMendixObject().setValue(context, MemberNames.DataTableContextEntity_Person_Current.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DataTableContextEntity_Person_Current.toString(), datatablecontextentity_person_current.getMendixObject().getId());
	}

	/**
	 * @return value of DataTableContextEntity_Country
	 */
	public final datatablestestmodule.proxies.Country getDataTableContextEntity_Country() throws com.mendix.core.CoreException
	{
		return getDataTableContextEntity_Country(getContext());
	}

	/**
	 * @param context
	 * @return value of DataTableContextEntity_Country
	 */
	public final datatablestestmodule.proxies.Country getDataTableContextEntity_Country(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		datatablestestmodule.proxies.Country result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DataTableContextEntity_Country.toString());
		if (identifier != null)
			result = datatablestestmodule.proxies.Country.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DataTableContextEntity_Country
	 * @param datatablecontextentity_country
	 */
	public final void setDataTableContextEntity_Country(datatablestestmodule.proxies.Country datatablecontextentity_country)
	{
		setDataTableContextEntity_Country(getContext(), datatablecontextentity_country);
	}

	/**
	 * Set value of DataTableContextEntity_Country
	 * @param context
	 * @param datatablecontextentity_country
	 */
	public final void setDataTableContextEntity_Country(com.mendix.systemwideinterfaces.core.IContext context, datatablestestmodule.proxies.Country datatablecontextentity_country)
	{
		if (datatablecontextentity_country == null)
			getMendixObject().setValue(context, MemberNames.DataTableContextEntity_Country.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DataTableContextEntity_Country.toString(), datatablecontextentity_country.getMendixObject().getId());
	}

	/**
	 * @return value of DataTableContextEntity_Language
	 */
	public final system.proxies.Language getDataTableContextEntity_Language() throws com.mendix.core.CoreException
	{
		return getDataTableContextEntity_Language(getContext());
	}

	/**
	 * @param context
	 * @return value of DataTableContextEntity_Language
	 */
	public final system.proxies.Language getDataTableContextEntity_Language(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Language result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DataTableContextEntity_Language.toString());
		if (identifier != null)
			result = system.proxies.Language.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DataTableContextEntity_Language
	 * @param datatablecontextentity_language
	 */
	public final void setDataTableContextEntity_Language(system.proxies.Language datatablecontextentity_language)
	{
		setDataTableContextEntity_Language(getContext(), datatablecontextentity_language);
	}

	/**
	 * Set value of DataTableContextEntity_Language
	 * @param context
	 * @param datatablecontextentity_language
	 */
	public final void setDataTableContextEntity_Language(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Language datatablecontextentity_language)
	{
		if (datatablecontextentity_language == null)
			getMendixObject().setValue(context, MemberNames.DataTableContextEntity_Language.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DataTableContextEntity_Language.toString(), datatablecontextentity_language.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dataTableContextEntityMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final datatablestestmodule.proxies.DataTableContextEntity that = (datatablestestmodule.proxies.DataTableContextEntity) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DataTablesTestModule.DataTableContextEntity";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
