from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.portfolio_compact import PortfolioCompact
from openapi_server import util

from openapi_server.models.portfolio_compact import PortfolioCompact  # noqa: E501

class GetPortfolios200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetPortfolios200Response - a model defined in OpenAPI

        :param data: The data of this GetPortfolios200Response.  # noqa: E501
        :type data: List[PortfolioCompact]
        """
        self.openapi_types = {
            'data': List[PortfolioCompact]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetPortfolios200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getPortfolios_200_response of this GetPortfolios200Response.  # noqa: E501
        :rtype: GetPortfolios200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[PortfolioCompact]:
        """Gets the data of this GetPortfolios200Response.


        :return: The data of this GetPortfolios200Response.
        :rtype: List[PortfolioCompact]
        """
        return self._data

    @data.setter
    def data(self, data: List[PortfolioCompact]):
        """Sets the data of this GetPortfolios200Response.


        :param data: The data of this GetPortfolios200Response.
        :type data: List[PortfolioCompact]
        """

        self._data = data
