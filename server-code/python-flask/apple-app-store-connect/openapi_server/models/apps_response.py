from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app import App
from openapi_server.models.app_response_included_inner import AppResponseIncludedInner
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app import App  # noqa: E501
from openapi_server.models.app_response_included_inner import AppResponseIncludedInner  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None, meta=None):  # noqa: E501
        """AppsResponse - a model defined in OpenAPI

        :param data: The data of this AppsResponse.  # noqa: E501
        :type data: List[App]
        :param included: The included of this AppsResponse.  # noqa: E501
        :type included: List[AppResponseIncludedInner]
        :param links: The links of this AppsResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this AppsResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[App],
            'included': List[AppResponseIncludedInner],
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
    def from_dict(cls, dikt) -> 'AppsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppsResponse of this AppsResponse.  # noqa: E501
        :rtype: AppsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[App]:
        """Gets the data of this AppsResponse.


        :return: The data of this AppsResponse.
        :rtype: List[App]
        """
        return self._data

    @data.setter
    def data(self, data: List[App]):
        """Sets the data of this AppsResponse.


        :param data: The data of this AppsResponse.
        :type data: List[App]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[AppResponseIncludedInner]:
        """Gets the included of this AppsResponse.


        :return: The included of this AppsResponse.
        :rtype: List[AppResponseIncludedInner]
        """
        return self._included

    @included.setter
    def included(self, included: List[AppResponseIncludedInner]):
        """Sets the included of this AppsResponse.


        :param included: The included of this AppsResponse.
        :type included: List[AppResponseIncludedInner]
        """

        self._included = included

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this AppsResponse.


        :return: The links of this AppsResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this AppsResponse.


        :param links: The links of this AppsResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppsResponse.


        :return: The meta of this AppsResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppsResponse.


        :param meta: The meta of this AppsResponse.
        :type meta: PagingInformation
        """

        self._meta = meta