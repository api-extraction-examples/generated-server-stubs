from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_info import AppInfo
from openapi_server.models.app_info_response_included_inner import AppInfoResponseIncludedInner
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_info import AppInfo  # noqa: E501
from openapi_server.models.app_info_response_included_inner import AppInfoResponseIncludedInner  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppInfosResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None, meta=None):  # noqa: E501
        """AppInfosResponse - a model defined in OpenAPI

        :param data: The data of this AppInfosResponse.  # noqa: E501
        :type data: List[AppInfo]
        :param included: The included of this AppInfosResponse.  # noqa: E501
        :type included: List[AppInfoResponseIncludedInner]
        :param links: The links of this AppInfosResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this AppInfosResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppInfo],
            'included': List[AppInfoResponseIncludedInner],
            'links': PagedDocumentLinks,
            'meta': PagingInformation
        }

        self.attribute_map = {
            'data': 'data',
            'included': 'included',
            'links': 'links',
            'meta': 'meta'
        }

        self._data = data
        self._included = included
        self._links = links
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'AppInfosResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppInfosResponse of this AppInfosResponse.  # noqa: E501
        :rtype: AppInfosResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppInfo]:
        """Gets the data of this AppInfosResponse.


        :return: The data of this AppInfosResponse.
        :rtype: List[AppInfo]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppInfo]):
        """Sets the data of this AppInfosResponse.


        :param data: The data of this AppInfosResponse.
        :type data: List[AppInfo]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[AppInfoResponseIncludedInner]:
        """Gets the included of this AppInfosResponse.


        :return: The included of this AppInfosResponse.
        :rtype: List[AppInfoResponseIncludedInner]
        """
        return self._included

    @included.setter
    def included(self, included: List[AppInfoResponseIncludedInner]):
        """Sets the included of this AppInfosResponse.


        :param included: The included of this AppInfosResponse.
        :type included: List[AppInfoResponseIncludedInner]
        """

        self._included = included

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this AppInfosResponse.


        :return: The links of this AppInfosResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this AppInfosResponse.


        :param links: The links of this AppInfosResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppInfosResponse.


        :return: The meta of this AppInfosResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppInfosResponse.


        :param meta: The meta of this AppInfosResponse.
        :type meta: PagingInformation
        """

        self._meta = meta