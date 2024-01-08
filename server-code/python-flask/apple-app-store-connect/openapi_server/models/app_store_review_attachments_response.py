from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_review_attachment import AppStoreReviewAttachment
from openapi_server.models.paged_document_links import PagedDocumentLinks
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_store_review_attachment import AppStoreReviewAttachment  # noqa: E501
from openapi_server.models.paged_document_links import PagedDocumentLinks  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppStoreReviewAttachmentsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """AppStoreReviewAttachmentsResponse - a model defined in OpenAPI

        :param data: The data of this AppStoreReviewAttachmentsResponse.  # noqa: E501
        :type data: List[AppStoreReviewAttachment]
        :param links: The links of this AppStoreReviewAttachmentsResponse.  # noqa: E501
        :type links: PagedDocumentLinks
        :param meta: The meta of this AppStoreReviewAttachmentsResponse.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppStoreReviewAttachment],
            'links': PagedDocumentLinks,
            'meta': PagingInformation
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links',
            'meta': 'meta'
        }

        self._data = data
        self._links = links
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreReviewAttachmentsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreReviewAttachmentsResponse of this AppStoreReviewAttachmentsResponse.  # noqa: E501
        :rtype: AppStoreReviewAttachmentsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppStoreReviewAttachment]:
        """Gets the data of this AppStoreReviewAttachmentsResponse.


        :return: The data of this AppStoreReviewAttachmentsResponse.
        :rtype: List[AppStoreReviewAttachment]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppStoreReviewAttachment]):
        """Sets the data of this AppStoreReviewAttachmentsResponse.


        :param data: The data of this AppStoreReviewAttachmentsResponse.
        :type data: List[AppStoreReviewAttachment]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> PagedDocumentLinks:
        """Gets the links of this AppStoreReviewAttachmentsResponse.


        :return: The links of this AppStoreReviewAttachmentsResponse.
        :rtype: PagedDocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: PagedDocumentLinks):
        """Sets the links of this AppStoreReviewAttachmentsResponse.


        :param links: The links of this AppStoreReviewAttachmentsResponse.
        :type links: PagedDocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppStoreReviewAttachmentsResponse.


        :return: The meta of this AppStoreReviewAttachmentsResponse.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppStoreReviewAttachmentsResponse.


        :param meta: The meta of this AppStoreReviewAttachmentsResponse.
        :type meta: PagingInformation
        """

        self._meta = meta
