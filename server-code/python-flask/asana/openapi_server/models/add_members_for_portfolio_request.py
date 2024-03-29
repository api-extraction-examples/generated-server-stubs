from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.add_members_request import AddMembersRequest
from openapi_server import util

from openapi_server.models.add_members_request import AddMembersRequest  # noqa: E501

class AddMembersForPortfolioRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AddMembersForPortfolioRequest - a model defined in OpenAPI

        :param data: The data of this AddMembersForPortfolioRequest.  # noqa: E501
        :type data: AddMembersRequest
        """
        self.openapi_types = {
            'data': AddMembersRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AddMembersForPortfolioRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The addMembersForPortfolio_request of this AddMembersForPortfolioRequest.  # noqa: E501
        :rtype: AddMembersForPortfolioRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AddMembersRequest:
        """Gets the data of this AddMembersForPortfolioRequest.


        :return: The data of this AddMembersForPortfolioRequest.
        :rtype: AddMembersRequest
        """
        return self._data

    @data.setter
    def data(self, data: AddMembersRequest):
        """Sets the data of this AddMembersForPortfolioRequest.


        :param data: The data of this AddMembersForPortfolioRequest.
        :type data: AddMembersRequest
        """

        self._data = data
