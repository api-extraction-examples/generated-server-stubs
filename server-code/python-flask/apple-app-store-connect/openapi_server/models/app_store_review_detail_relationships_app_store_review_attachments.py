from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_store_review_detail_relationships_app_store_review_attachments_data_inner import AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_store_review_detail_relationships_app_store_review_attachments_data_inner import AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppStoreReviewDetailRelationshipsAppStoreReviewAttachments(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """AppStoreReviewDetailRelationshipsAppStoreReviewAttachments - a model defined in OpenAPI

        :param data: The data of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.  # noqa: E501
        :type data: List[AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner]
        :param links: The links of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        :param meta: The meta of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner],
            'links': AppRelationshipsAppInfosLinks,
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
    def from_dict(cls, dikt) -> 'AppStoreReviewDetailRelationshipsAppStoreReviewAttachments':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreReviewDetail_relationships_appStoreReviewAttachments of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.  # noqa: E501
        :rtype: AppStoreReviewDetailRelationshipsAppStoreReviewAttachments
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner]:
        """Gets the data of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.


        :return: The data of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.
        :rtype: List[AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner]):
        """Sets the data of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.


        :param data: The data of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.
        :type data: List[AppStoreReviewDetailRelationshipsAppStoreReviewAttachmentsDataInner]
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.


        :return: The links of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.


        :param links: The links of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.


        :return: The meta of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.


        :param meta: The meta of this AppStoreReviewDetailRelationshipsAppStoreReviewAttachments.
        :type meta: PagingInformation
        """

        self._meta = meta
