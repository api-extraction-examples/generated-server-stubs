from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.portfolio_request import PortfolioRequest
from openapi_server import util

from openapi_server.models.portfolio_request import PortfolioRequest  # noqa: E501

class CreatePortfolioRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """CreatePortfolioRequest - a model defined in OpenAPI

        :param data: The data of this CreatePortfolioRequest.  # noqa: E501
        :type data: PortfolioRequest
        """
        self.openapi_types = {
            'data': PortfolioRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'CreatePortfolioRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createPortfolio_request of this CreatePortfolioRequest.  # noqa: E501
        :rtype: CreatePortfolioRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> PortfolioRequest:
        """Gets the data of this CreatePortfolioRequest.


        :return: The data of this CreatePortfolioRequest.
        :rtype: PortfolioRequest
        """
        return self._data

    @data.setter
    def data(self, data: PortfolioRequest):
        """Sets the data of this CreatePortfolioRequest.


        :param data: The data of this CreatePortfolioRequest.
        :type data: PortfolioRequest
        """

        self._data = data
