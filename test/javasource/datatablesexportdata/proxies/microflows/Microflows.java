// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datatablesexportdata.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the DataTablesExportData module
	public static void aCT_DataTablesExportData(IContext context, datatablestestmodule.proxies.DataTableContextEntity _dataTableContextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DataTableContextEntity", _dataTableContextEntity == null ? null : _dataTableContextEntity.getMendixObject());
			Core.execute(context, "DataTablesExportData.ACT_DataTablesExportData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}