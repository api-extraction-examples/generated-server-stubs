from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_preview import AppPreview
from openapi_server.models.app_preview_set import AppPreviewSet
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_preview import AppPreview  # noqa: E501
from openapi_server.models.app_preview_set import AppPreviewSet  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppPreviewSetsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, included=None, links=None, meta=None):  # noqa: E501
        """AppPreviewSetsResponse - a model defined in OpenAPI

        :param data: The data of this AppPreviewSetsResponse.  # noqa: E501
        :type data: List[AppPreviewSet]
        :param included: The included of this AppPreviewSetsResponse.  # noqa: E501
        :type included: List[AppPreview]
        :param links: The links of this AppPreviewSetsResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this AppPreviewSetsResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppPreviewSet],
            'included': List[AppPreview],
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
    def from_dict(cls, dikt) -> 'AppPreviewSetsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreviewSetsResponse of this AppPreviewSetsResponse.  # noqa: E501
        :rtype: AppPreviewSetsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppPreviewSet]:
        """Gets the data of this AppPreviewSetsResponse.


        :return: The data of this AppPreviewSetsResponse.
        :rtype: List[AppPreviewSet]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppPreviewSet]):
        """Sets the data of this AppPreviewSetsResponse.


        :param data: The data of this AppPreviewSetsResponse.
        :type data: List[AppPreviewSet]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def included(self) -> List[AppPreview]:
        """Gets the included of this AppPreviewSetsResponse.


        :return: The included of this AppPreviewSetsResponse.
        :rtype: List[AppPreview]
        """
        return self._included

    @included.setter
    def included(self, included: List[AppPreview]):
        """Sets the included of this AppPreviewSetsResponse.


        :param included: The included of this AppPreviewSetsResponse.
        :type included: List[AppPreview]
        """

        self._included = included

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this AppPreviewSetsResponse.


        :return: The links of this AppPreviewSetsResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this AppPreviewSetsResponse.


        :param links: The links of this AppPreviewSetsResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppPreviewSetsResponse.


        :return: The meta of this AppPreviewSetsResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppPreviewSetsResponse.


        :param meta: The meta of this AppPreviewSetsResponse.
        :type meta: PagingInformation
        """

        self._meta = meta
