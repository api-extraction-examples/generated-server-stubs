from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.sales_tax import SalesTax
from openapi_server import util

from openapi_server.models.sales_tax import SalesTax  # noqa: E501

class SalesTaxes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, sales_taxes=None):  # noqa: E501
        """SalesTaxes - a model defined in OpenAPI

        :param sales_taxes: The sales_taxes of this SalesTaxes.  # noqa: E501
        :type sales_taxes: List[SalesTax]
        """
        self.openapi_types = {
            'sales_taxes': List[SalesTax]
        }

        self.attribute_map = {
            'sales_taxes': 'salesTaxes'
        }

        self._sales_taxes = sales_taxes

    @classmethod
    def from_dict(cls, dikt) -> 'SalesTaxes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SalesTaxes of this SalesTaxes.  # noqa: E501
        :rtype: SalesTaxes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def sales_taxes(self) -> List[SalesTax]:
        """Gets the sales_taxes of this SalesTaxes.

        An array of one or more sales tax rate entries for a specific marketplace (or all applicable marketplaces if the <b>country_code</b> query parameter is not used.<br><br>If no sales tax rate entries are set up, no response payload is returned, but only an HTTP status code of <code>204 No Content</code>.  # noqa: E501

        :return: The sales_taxes of this SalesTaxes.
        :rtype: List[SalesTax]
        """
        return self._sales_taxes

    @sales_taxes.setter
    def sales_taxes(self, sales_taxes: List[SalesTax]):
        """Sets the sales_taxes of this SalesTaxes.

        An array of one or more sales tax rate entries for a specific marketplace (or all applicable marketplaces if the <b>country_code</b> query parameter is not used.<br><br>If no sales tax rate entries are set up, no response payload is returned, but only an HTTP status code of <code>204 No Content</code>.  # noqa: E501

        :param sales_taxes: The sales_taxes of this SalesTaxes.
        :type sales_taxes: List[SalesTax]
        """

        self._sales_taxes = sales_taxes
