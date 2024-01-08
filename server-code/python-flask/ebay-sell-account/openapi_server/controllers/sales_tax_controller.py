import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.sales_tax import SalesTax  # noqa: E501
from openapi_server.models.sales_tax_base import SalesTaxBase  # noqa: E501
from openapi_server.models.sales_taxes import SalesTaxes  # noqa: E501
from openapi_server import util


def create_or_replace_sales_tax(country_code, jurisdiction_id, sales_tax_base):  # noqa: E501
    """create_or_replace_sales_tax

    This method creates or updates a sales tax table entry for a jurisdiction. Specify the tax table entry you want to configure using the two path parameters: &lt;b&gt;countryCode&lt;/b&gt; and &lt;b&gt;jurisdictionId&lt;/b&gt;.  &lt;br/&gt;&lt;br/&gt;A tax table entry for a jurisdiction is comprised of two fields: one for the jurisdiction&#39;s sales-tax rate and another that&#39;s a boolean value indicating whether or not shipping and handling are taxed in the jurisdiction.  &lt;br/&gt;&lt;br/&gt;You can set up &lt;i&gt;tax tables&lt;/i&gt; for countries that support different &lt;i&gt;tax jurisdictions&lt;/i&gt;. Currently, only Canada, India, and the US support separate tax jurisdictions. If you sell into any of these countries, you can set up tax tables for any of the country&#39;s jurisdictions. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API.  &lt;br/&gt;&lt;br/&gt;For details on using this call, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/tax-tables.html\&quot;&gt;Establishing sales-tax tables&lt;/a&gt;. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; In the US, eBay now &#39;collects and remits&#39; sales tax for every US state except for Missouri (and a few US territories), so sellers can no longer configure sales tax rates for any states except Missouri. With eBay &#39;collect and remit&#39;, eBay calculates the sales tax, collects the sales tax from the buyer, and remits the sales tax to the tax authorities at the buyer&#39;s location.&lt;/span&gt; # noqa: E501

    :param country_code: This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country for which you want to create a sales tax table entry.
    :type country_code: str
    :param jurisdiction_id: This path parameter specifies the ID of the tax jurisdiction for the table entry you want to create. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API.
    :type jurisdiction_id: str
    :param sales_tax_base: A container that describes the how the sales tax is calculated.
    :type sales_tax_base: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        sales_tax_base = SalesTaxBase.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_sales_tax(country_code, jurisdiction_id):  # noqa: E501
    """delete_sales_tax

    This call deletes a sales tax table entry for a jurisdiction. Specify the jurisdiction to delete using the &lt;b&gt;countryCode&lt;/b&gt; and &lt;b&gt;jurisdictionId&lt;/b&gt; path parameters. # noqa: E501

    :param country_code: This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose sales tax table entry you want to delete.
    :type country_code: str
    :param jurisdiction_id: This path parameter specifies the ID of the sales tax jurisdiction whose table entry you want to delete. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API.
    :type jurisdiction_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_sales_tax(country_code, jurisdiction_id):  # noqa: E501
    """get_sales_tax

    This call gets the current sales tax table entry for a specific tax jurisdiction. Specify the jurisdiction to retrieve using the &lt;b&gt;countryCode&lt;/b&gt; and &lt;b&gt;jurisdictionId&lt;/b&gt; path parameters. All four response fields will be returned if a sales tax entry exists for the tax jurisdiction. Otherwise, the response will be returned as empty.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; In most US states and territories, eBay now &#39;collects and remits&#39; sales tax, so sellers can no longer configure sales tax rates for these states/territories.&lt;/span&gt; # noqa: E501

    :param country_code: This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose sales tax table you want to retrieve.
    :type country_code: str
    :param jurisdiction_id: This path parameter specifies the ID of the sales tax jurisdiction for the tax table entry you want to retrieve. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API.
    :type jurisdiction_id: str

    :rtype: Union[SalesTax, Tuple[SalesTax, int], Tuple[SalesTax, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_sales_taxes(country_code):  # noqa: E501
    """get_sales_taxes

    Use this call to retrieve all sales tax table entries that the seller has defined for a specific country. All four response fields will be returned for each tax jurisdiction that matches the search criteria. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; In most US states and territories, eBay now &#39;collects and remits&#39; sales tax, so sellers can no longer configure sales tax rates for these states/territories.&lt;/span&gt; # noqa: E501

    :param country_code: This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose tax table you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum
    :type country_code: str

    :rtype: Union[SalesTaxes, Tuple[SalesTaxes, int], Tuple[SalesTaxes, int, Dict[str, str]]
    """
    return 'do some magic!'
