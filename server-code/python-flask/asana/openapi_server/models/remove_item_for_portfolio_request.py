from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.portfolio_remove_item_request import PortfolioRemoveItemRequest
from openapi_server import util

from openapi_server.models.portfolio_remove_item_request import PortfolioRemoveItemRequest  # noqa: E501

class RemoveItemForPortfolioRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """RemoveItemForPortfolioRequest - a model defined in OpenAPI

        :param data: The data of this RemoveItemForPortfolioRequest.  # noqa: E501
        :type data: PortfolioRemoveItemRequest
        """
        self.openapi_types = {
            'data': PortfolioRemoveItemRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'RemoveItemForPortfolioRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The removeItemForPortfolio_request of this RemoveItemForPortfolioRequest.  # noqa: E501
        :rtype: RemoveItemForPortfolioRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> PortfolioRemoveItemRequest:
        """Gets the data of this RemoveItemForPortfolioRequest.


        :return: The data of this RemoveItemForPortfolioRequest.
        :rtype: PortfolioRemoveItemRequest
        """
        return self._data

    @data.setter
    def data(self, data: PortfolioRemoveItemRequest):
        """Sets the data of this RemoveItemForPortfolioRequest.


        :param data: The data of this RemoveItemForPortfolioRequest.
        :type data: PortfolioRemoveItemRequest
        """

        self._data = data