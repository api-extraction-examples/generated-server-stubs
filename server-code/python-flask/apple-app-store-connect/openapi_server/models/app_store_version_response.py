from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version import AppStoreVersion
from openapi_server.models.app_store_version_response_included_inner import AppStoreVersionResponseIncludedInner
from openapi_server.models.document_links import DocumentLinks
from openapi_server import util

from openapi_server.models.app_store_version import AppStoreVersion  # noqa: E501
from openapi_server.models.app_store_version_response_included_inner import AppStoreVersionResponseIncludedInner  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501

class AppStoreVersionResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None):  # noqa: E501
        """AppStoreVersionResponse - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionResponse.  # noqa: E501
        :type data: AppStoreVersion
        :param included: The included of this AppStoreVersionResponse.  # noqa: E501
        :type included: List[AppStoreVersionResponseIncludedInner]
        :param links: The links of this AppStoreVersionResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': AppStoreVersion,
            'included': List[AppStoreVersionResponseIncludedInner],
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'included': 'included',
            'links': 'links'
        }

        self._data = data
        self._included = included
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionResponse of this AppStoreVersionResponse.  # noqa: E501
        :rtype: AppStoreVersionResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreVersion:
        """Gets the data of this AppStoreVersionResponse.


        :return: The data of this AppStoreVersionResponse.
        :rtype: AppStoreVersion
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreVersion):
        """Sets the data of this AppStoreVersionResponse.


        :param data: The data of this AppStoreVersionResponse.
        :type data: AppStoreVersion
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[AppStoreVersionResponseIncludedInner]:
        """Gets the included of this AppStoreVersionResponse.


        :return: The included of this AppStoreVersionResponse.
        :rtype: List[AppStoreVersionResponseIncludedInner]
        """
        return self._included

    @included.setter
    def included(self, included: List[AppStoreVersionResponseIncludedInner]):
        """Sets the included of this AppStoreVersionResponse.


        :param included: The included of this AppStoreVersionResponse.
        :type included: List[AppStoreVersionResponseIncludedInner]
        """

        self._included = included

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this AppStoreVersionResponse.


        :return: The links of this AppStoreVersionResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this AppStoreVersionResponse.


        :param links: The links of this AppStoreVersionResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
