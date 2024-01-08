from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_categories_response_included_inner import AppCategoriesResponseIncludedInner
from openapi_server.models.app_category import AppCategory
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_categories_response_included_inner import AppCategoriesResponseIncludedInner  # noqa: E501
from openapi_server.models.app_category import AppCategory  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppCategoriesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None, meta=None):  # noqa: E501
        """AppCategoriesResponse - a model defined in OpenAPI

        :param data: The data of this AppCategoriesResponse.  # noqa: E501
        :type data: List[AppCategory]
        :param included: The included of this AppCategoriesResponse.  # noqa: E501
        :type included: List[AppCategoriesResponseIncludedInner]
        :param links: The links of this AppCategoriesResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this AppCategoriesResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppCategory],
            'included': List[AppCategoriesResponseIncludedInner],
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
    def from_dict(cls, dikt) -> 'AppCategoriesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppCategoriesResponse of this AppCategoriesResponse.  # noqa: E501
        :rtype: AppCategoriesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppCategory]:
        """Gets the data of this AppCategoriesResponse.


        :return: The data of this AppCategoriesResponse.
        :rtype: List[AppCategory]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppCategory]):
        """Sets the data of this AppCategoriesResponse.


        :param data: The data of this AppCategoriesResponse.
        :type data: List[AppCategory]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[AppCategoriesResponseIncludedInner]:
        """Gets the included of this AppCategoriesResponse.


        :return: The included of this AppCategoriesResponse.
        :rtype: List[AppCategoriesResponseIncludedInner]
        """
        return self._included

    @included.setter
    def included(self, included: List[AppCategoriesResponseIncludedInner]):
        """Sets the included of this AppCategoriesResponse.


        :param included: The included of this AppCategoriesResponse.
        :type included: List[AppCategoriesResponseIncludedInner]
        """

        self._included = included

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this AppCategoriesResponse.


        :return: The links of this AppCategoriesResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this AppCategoriesResponse.


        :param links: The links of this AppCategoriesResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppCategoriesResponse.


        :return: The meta of this AppCategoriesResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppCategoriesResponse.


        :param meta: The meta of this AppCategoriesResponse.
        :type meta: PagingInformation
        """

        self._meta = meta