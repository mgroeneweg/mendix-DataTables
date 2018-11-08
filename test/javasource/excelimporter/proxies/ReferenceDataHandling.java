// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum ReferenceDataHandling
{
	Overwrite(new java.lang.String[][] { new java.lang.String[] { "en_US", "Overwrite" }, new java.lang.String[] { "nl_NL", "Overschrijven" }, new java.lang.String[] { "en_GB", "Overwrite" }, new java.lang.String[] { "en_ZA", "Overwrite" } }),
	Append(new java.lang.String[][] { new java.lang.String[] { "en_US", "Append" }, new java.lang.String[] { "nl_NL", "Aanvullen" }, new java.lang.String[] { "en_GB", "Append" }, new java.lang.String[] { "en_ZA", "Append" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ReferenceDataHandling(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
