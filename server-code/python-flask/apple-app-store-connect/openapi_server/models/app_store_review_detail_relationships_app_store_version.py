from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_relationships_app_store_versions_data_inner import AppRelationshipsAppStoreVersionsDataInner
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_relationships_app_store_versions_data_inner import AppRelationshipsAppStoreVersionsDataInner  # noqa: E501

class AppStoreReviewDetailRelationshipsAppStoreVersion(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppStoreReviewDetailRelationshipsAppStoreVersion - a model defined in OpenAPI

        :param data: The data of this AppStoreReviewDetailRelationshipsAppStoreVersion.  # noqa: E501
        :type data: AppRelationshipsAppStoreVersionsDataInner
        :param links: The links of this AppStoreReviewDetailRelationshipsAppStoreVersion.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': AppRelationshipsAppStoreVersionsDataInner,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreReviewDetailRelationshipsAppStoreVersion':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreReviewDetail_relationships_appStoreVersion of this AppStoreReviewDetailRelationshipsAppStoreVersion.  # noqa: E501
        :rtype: AppStoreReviewDetailRelationshipsAppStoreVersion
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppRelationshipsAppStoreVersionsDataInner:
        """Gets the data of this AppStoreReviewDetailRelationshipsAppStoreVersion.


        :return: The data of this AppStoreReviewDetailRelationshipsAppStoreVersion.
        :rtype: AppRelationshipsAppStoreVersionsDataInner
        """
        return self._data

    @data.setter
    def data(self, data: AppRelationshipsAppStoreVersionsDataInner):
        """Sets the data of this AppStoreReviewDetailRelationshipsAppStoreVersion.


        :param data: The data of this AppStoreReviewDetailRelationshipsAppStoreVersion.
        :type data: AppRelationshipsAppStoreVersionsDataInner
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppStoreReviewDetailRelationshipsAppStoreVersion.


        :return: The links of this AppStoreReviewDetailRelationshipsAppStoreVersion.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppStoreReviewDetailRelationshipsAppStoreVersion.


        :param links: The links of this AppStoreReviewDetailRelationshipsAppStoreVersion.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links
