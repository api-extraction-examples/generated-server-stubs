from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_create_request_data_relationships_build import AppStoreVersionCreateRequestDataRelationshipsBuild
from openapi_server import util

from openapi_server.models.app_store_version_create_request_data_relationships_build import AppStoreVersionCreateRequestDataRelationshipsBuild  # noqa: E501

class AppStoreVersionUpdateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, build=None):  # noqa: E501
        """AppStoreVersionUpdateRequestDataRelationships - a model defined in OpenAPI

        :param build: The build of this AppStoreVersionUpdateRequestDataRelationships.  # noqa: E501
        :type build: AppStoreVersionCreateRequestDataRelationshipsBuild
        """
        self.openapi_types = {
            'build': AppStoreVersionCreateRequestDataRelationshipsBuild
        }

        self.attribute_map = {
            'build': 'build'
        }

        self._build = build

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionUpdateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionUpdateRequest_data_relationships of this AppStoreVersionUpdateRequestDataRelationships.  # noqa: E501
        :rtype: AppStoreVersionUpdateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def build(self) -> AppStoreVersionCreateRequestDataRelationshipsBuild:
        """Gets the build of this AppStoreVersionUpdateRequestDataRelationships.


        :return: The build of this AppStoreVersionUpdateRequestDataRelationships.
        :rtype: AppStoreVersionCreateRequestDataRelationshipsBuild
        """
        return self._build

    @build.setter
    def build(self, build: AppStoreVersionCreateRequestDataRelationshipsBuild):
        """Sets the build of this AppStoreVersionUpdateRequestDataRelationships.


        :param build: The build of this AppStoreVersionUpdateRequestDataRelationships.
        :type build: AppStoreVersionCreateRequestDataRelationshipsBuild
        """

        self._build = build
