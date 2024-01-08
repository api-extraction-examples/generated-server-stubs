from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_store_version_relationships_app_store_version_submission_data import AppStoreVersionRelationshipsAppStoreVersionSubmissionData
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_store_version_relationships_app_store_version_submission_data import AppStoreVersionRelationshipsAppStoreVersionSubmissionData  # noqa: E501

class AppStoreVersionRelationshipsAppStoreVersionSubmission(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppStoreVersionRelationshipsAppStoreVersionSubmission - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionRelationshipsAppStoreVersionSubmission.  # noqa: E501
        :type data: AppStoreVersionRelationshipsAppStoreVersionSubmissionData
        :param links: The links of this AppStoreVersionRelationshipsAppStoreVersionSubmission.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': AppStoreVersionRelationshipsAppStoreVersionSubmissionData,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionRelationshipsAppStoreVersionSubmission':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersion_relationships_appStoreVersionSubmission of this AppStoreVersionRelationshipsAppStoreVersionSubmission.  # noqa: E501
        :rtype: AppStoreVersionRelationshipsAppStoreVersionSubmission
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreVersionRelationshipsAppStoreVersionSubmissionData:
        """Gets the data of this AppStoreVersionRelationshipsAppStoreVersionSubmission.


        :return: The data of this AppStoreVersionRelationshipsAppStoreVersionSubmission.
        :rtype: AppStoreVersionRelationshipsAppStoreVersionSubmissionData
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreVersionRelationshipsAppStoreVersionSubmissionData):
        """Sets the data of this AppStoreVersionRelationshipsAppStoreVersionSubmission.


        :param data: The data of this AppStoreVersionRelationshipsAppStoreVersionSubmission.
        :type data: AppStoreVersionRelationshipsAppStoreVersionSubmissionData
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppStoreVersionRelationshipsAppStoreVersionSubmission.


        :return: The links of this AppStoreVersionRelationshipsAppStoreVersionSubmission.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppStoreVersionRelationshipsAppStoreVersionSubmission.


        :param links: The links of this AppStoreVersionRelationshipsAppStoreVersionSubmission.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links
