from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_store_review_attachment_relationships_app_store_review_detail_data import AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_store_review_attachment_relationships_app_store_review_detail_data import AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData  # noqa: E501

class AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail - a model defined in OpenAPI

        :param data: The data of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.  # noqa: E501
        :type data: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData
        :param links: The links of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreReviewAttachment_relationships_appStoreReviewDetail of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.  # noqa: E501
        :rtype: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData:
        """Gets the data of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.


        :return: The data of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.
        :rtype: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData):
        """Sets the data of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.


        :param data: The data of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.
        :type data: AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.


        :return: The links of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.


        :param links: The links of this AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links
