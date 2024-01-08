from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_beta_testers_linkages_request_data_inner import AppBetaTestersLinkagesRequestDataInner
from openapi_server import util

from openapi_server.models.app_beta_testers_linkages_request_data_inner import AppBetaTestersLinkagesRequestDataInner  # noqa: E501

class AppBetaTestersLinkagesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppBetaTestersLinkagesRequest - a model defined in OpenAPI

        :param data: The data of this AppBetaTestersLinkagesRequest.  # noqa: E501
        :type data: List[AppBetaTestersLinkagesRequestDataInner]
        """
        self.openapi_types = {
            'data': List[AppBetaTestersLinkagesRequestDataInner]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppBetaTestersLinkagesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppBetaTestersLinkagesRequest of this AppBetaTestersLinkagesRequest.  # noqa: E501
        :rtype: AppBetaTestersLinkagesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppBetaTestersLinkagesRequestDataInner]:
        """Gets the data of this AppBetaTestersLinkagesRequest.


        :return: The data of this AppBetaTestersLinkagesRequest.
        :rtype: List[AppBetaTestersLinkagesRequestDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppBetaTestersLinkagesRequestDataInner]):
        """Sets the data of this AppBetaTestersLinkagesRequest.


        :param data: The data of this AppBetaTestersLinkagesRequest.
        :type data: List[AppBetaTestersLinkagesRequestDataInner]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data