from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.rate_table import RateTable
from openapi_server import util

from openapi_server.models.rate_table import RateTable  # noqa: E501

class RateTableResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, rate_tables=None):  # noqa: E501
        """RateTableResponse - a model defined in OpenAPI

        :param rate_tables: The rate_tables of this RateTableResponse.  # noqa: E501
        :type rate_tables: List[RateTable]
        """
        self.openapi_types = {
            'rate_tables': List[RateTable]
        }

        self.attribute_map = {
            'rate_tables': 'rateTables'
        }

        self._rate_tables = rate_tables

    @classmethod
    def from_dict(cls, dikt) -> 'RateTableResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RateTableResponse of this RateTableResponse.  # noqa: E501
        :rtype: RateTableResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def rate_tables(self) -> List[RateTable]:
        """Gets the rate_tables of this RateTableResponse.

        An array of all shipping rate tables defined for a marketplace (or all marketplaces if no <b>country_code</b> query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.  # noqa: E501

        :return: The rate_tables of this RateTableResponse.
        :rtype: List[RateTable]
        """
        return self._rate_tables

    @rate_tables.setter
    def rate_tables(self, rate_tables: List[RateTable]):
        """Sets the rate_tables of this RateTableResponse.

        An array of all shipping rate tables defined for a marketplace (or all marketplaces if no <b>country_code</b> query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.  # noqa: E501

        :param rate_tables: The rate_tables of this RateTableResponse.
        :type rate_tables: List[RateTable]
        """

        self._rate_tables = rate_tables