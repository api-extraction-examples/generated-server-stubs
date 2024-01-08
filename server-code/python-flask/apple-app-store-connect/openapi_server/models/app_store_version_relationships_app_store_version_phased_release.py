from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_store_version_relationships_app_store_version_phased_release_data import AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_store_version_relationships_app_store_version_phased_release_data import AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData  # noqa: E501

class AppStoreVersionRelationshipsAppStoreVersionPhasedRelease(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppStoreVersionRelationshipsAppStoreVersionPhasedRelease - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.  # noqa: E501
        :type data: AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData
        :param links: The links of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionRelationshipsAppStoreVersionPhasedRelease':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersion_relationships_appStoreVersionPhasedRelease of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.  # noqa: E501
        :rtype: AppStoreVersionRelationshipsAppStoreVersionPhasedRelease
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData:
        """Gets the data of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.


        :return: The data of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.
        :rtype: AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData):
        """Sets the data of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.


        :param data: The data of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.
        :type data: AppStoreVersionRelationshipsAppStoreVersionPhasedReleaseData
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.


        :return: The links of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.


        :param links: The links of this AppStoreVersionRelationshipsAppStoreVersionPhasedRelease.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links