from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.document_links import DocumentLinks
from openapi_server.models.in_app_purchase import InAppPurchase
from openapi_server import util

from openapi_server.models.document_links import DocumentLinks  # noqa: E501
from openapi_server.models.in_app_purchase import InAppPurchase  # noqa: E501

class InAppPurchaseResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """InAppPurchaseResponse - a model defined in OpenAPI

        :param data: The data of this InAppPurchaseResponse.  # noqa: E501
        :type data: InAppPurchase
        :param links: The links of this InAppPurchaseResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': InAppPurchase,
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'InAppPurchaseResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The InAppPurchaseResponse of this InAppPurchaseResponse.  # noqa: E501
        :rtype: InAppPurchaseResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> InAppPurchase:
        """Gets the data of this InAppPurchaseResponse.


        :return: The data of this InAppPurchaseResponse.
        :rtype: InAppPurchase
        """
        return self._data

    @data.setter
    def data(self, data: InAppPurchase):
        """Sets the data of this InAppPurchaseResponse.


        :param data: The data of this InAppPurchaseResponse.
        :type data: InAppPurchase
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this InAppPurchaseResponse.


        :return: The links of this InAppPurchaseResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this InAppPurchaseResponse.


        :param links: The links of this InAppPurchaseResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links