// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datatablestestmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the DataTablesTestModule module
	public static void aCT_Country_ConnectToPersonData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.ACT_Country_ConnectToPersonData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Country_SetLanguage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.ACT_Country_SetLanguage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_DataTableContextEntity_ForceRefresh(IContext context, datatablestestmodule.proxies.DataTableContextEntity _dataTableContextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DataTableContextEntity", _dataTableContextEntity == null ? null : _dataTableContextEntity.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_DataTableContextEntity_ForceRefresh", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_DataTableContextEntity_ForceRefreshKeepPosition(IContext context, datatablestestmodule.proxies.DataTableContextEntity _dataTableContextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DataTableContextEntity", _dataTableContextEntity == null ? null : _dataTableContextEntity.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_DataTableContextEntity_ForceRefreshKeepPosition", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ImportData(IContext context, datatablestestmodule.proxies.ImportData _importData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ImportData", _importData == null ? null : _importData.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_ImportData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Person_LogSelection(IContext context, java.util.List<datatablestestmodule.proxies.Person> _personList, datatablestestmodule.proxies.Person _person)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_personList = null;
			if (_personList != null)
			{
				listparam_personList = new java.util.ArrayList<IMendixObject>();
				for (datatablestestmodule.proxies.Person obj : _personList)
					listparam_personList.add(obj.getMendixObject());
			}
			params.put("PersonList", listparam_personList);
			params.put("Person", _person == null ? null : _person.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_Person_LogSelection", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Person_LogSelectionWithObjectRefresh(IContext context, java.util.List<datatablestestmodule.proxies.Person> _personList, datatablestestmodule.proxies.Person _person)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_personList = null;
			if (_personList != null)
			{
				listparam_personList = new java.util.ArrayList<IMendixObject>();
				for (datatablestestmodule.proxies.Person obj : _personList)
					listparam_personList.add(obj.getMendixObject());
			}
			params.put("PersonList", listparam_personList);
			params.put("Person", _person == null ? null : _person.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_Person_LogSelectionWithObjectRefresh", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestCalcAttr_Create(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.ACT_TestCalcAttr_Create", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestCalcAttr_Delete(IContext context, datatablestestmodule.proxies.TestCalcAttr _testCalcAttr)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestCalcAttr", _testCalcAttr == null ? null : _testCalcAttr.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestCalcAttr_Delete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestCalcAttr_Edit(IContext context, datatablestestmodule.proxies.TestCalcAttr _testCalcAttr)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestCalcAttr", _testCalcAttr == null ? null : _testCalcAttr.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestCalcAttr_Edit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestCalcAttr_Save(IContext context, datatablestestmodule.proxies.TestCalcAttr _testCalcAttr)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestCalcAttr", _testCalcAttr == null ? null : _testCalcAttr.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestCalcAttr_Save", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestDataTypes_Create(IContext context, datatablestestmodule.proxies.DataTableContextEntity _dataTableContextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DataTableContextEntity", _dataTableContextEntity == null ? null : _dataTableContextEntity.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestDataTypes_Create", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestDataTypes_Delete(IContext context, datatablestestmodule.proxies.TestDataTypes _testDataTypes)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestDataTypes", _testDataTypes == null ? null : _testDataTypes.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestDataTypes_Delete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestDataTypes_Edit_InContent(IContext context, datatablestestmodule.proxies.TestDataTypes _testDataTypes)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestDataTypes", _testDataTypes == null ? null : _testDataTypes.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestDataTypes_Edit_InContent", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestDataTypes_Edit_Popup(IContext context, datatablestestmodule.proxies.TestDataTypes _testDataTypes)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestDataTypes", _testDataTypes == null ? null : _testDataTypes.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestDataTypes_Edit_Popup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestDataTypes_Edit_Popup_LongRunning(IContext context, datatablestestmodule.proxies.TestDataTypes _testDataTypes)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestDataTypes", _testDataTypes == null ? null : _testDataTypes.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestDataTypes_Edit_Popup_LongRunning", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_TestDataTypes_Save(IContext context, datatablestestmodule.proxies.TestDataTypes _testDataTypes)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestDataTypes", _testDataTypes == null ? null : _testDataTypes.getMendixObject());
			Core.execute(context, "DataTablesTestModule.ACT_TestDataTypes_Save", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean aSU_AfterStartup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "DataTablesTestModule.ASU_AfterStartup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static datatablestestmodule.proxies.Color cAL_TestCalcAttr_CalcAttr(IContext context, datatablestestmodule.proxies.TestCalcAttr _testCalcAttr)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TestCalcAttr", _testCalcAttr == null ? null : _testCalcAttr.getMendixObject());
			java.lang.String result = (java.lang.String)Core.execute(context, "DataTablesTestModule.CAL_TestCalcAttr_CalcAttr", params);
			if (result == null)
				return null;
			return datatablestestmodule.proxies.Color.valueOf(result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static datatablestestmodule.proxies.DataTableContextEntity dS_DataGridContextEntity(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "DataTablesTestModule.DS_DataGridContextEntity", params);
			return result == null ? null : datatablestestmodule.proxies.DataTableContextEntity.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static datatablestestmodule.proxies.ImportData dS_ImportData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "DataTablesTestModule.DS_ImportData", params);
			return result == null ? null : datatablestestmodule.proxies.ImportData.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_ShowDemoMasterDetail1(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.NT_ShowDemoMasterDetail1", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_ShowDemoMasterDetail2(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.NT_ShowDemoMasterDetail2", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_ShowDemoSearchFilters1(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.NT_ShowDemoSearchFilters1", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_ShowDemoSearchFilters2(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.NT_ShowDemoSearchFilters2", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_ShowDemoXPathInput(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.NT_ShowDemoXPathInput", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void nT_ShowHomePage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.NT_ShowHomePage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_DataTableContextEntity_DateTimeValue(IContext context, datatablestestmodule.proxies.DataTableContextEntity _dataTableContextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DataTableContextEntity", _dataTableContextEntity == null ? null : _dataTableContextEntity.getMendixObject());
			Core.execute(context, "DataTablesTestModule.OCh_DataTableContextEntity_DateTimeValue", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_Person_ShowSelectedPerson(IContext context, datatablestestmodule.proxies.Person _person)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Person", _person == null ? null : _person.getMendixObject());
			Core.execute(context, "DataTablesTestModule.OCh_Person_ShowSelectedPerson", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_Person_ShowSelectedPerson_NoEmptySelection(IContext context, datatablestestmodule.proxies.Person _person)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Person", _person == null ? null : _person.getMendixObject());
			Core.execute(context, "DataTablesTestModule.OCh_Person_ShowSelectedPerson_NoEmptySelection", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static datatablestestmodule.proxies.DataTableContextEntity sUB_DataTableContextEntity_GetFromSession(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "DataTablesTestModule.SUB_DataTableContextEntity_GetFromSession", params);
			return result == null ? null : datatablestestmodule.proxies.DataTableContextEntity.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_UserSessionObject_Create(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DataTablesTestModule.SUB_UserSessionObject_Create", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}