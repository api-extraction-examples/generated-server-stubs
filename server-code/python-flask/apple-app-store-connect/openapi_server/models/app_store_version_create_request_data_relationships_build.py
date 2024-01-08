from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_builds_data_inner import AppRelationshipsBuildsDataInner
from openapi_server import util

from openapi_server.models.app_relationships_builds_data_inner import AppRelationshipsBuildsDataInner  # noqa: E501

class AppStoreVersionCreateRequestDataRelationshipsBuild(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppStoreVersionCreateRequestDataRelationshipsBuild - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionCreateRequestDataRelationshipsBuild.  # noqa: E501
        :type data: AppRelationshipsBuildsDataInner
        """
        self.openapi_types = {
            'data': AppRelationshipsBuildsDataInner
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionCreateRequestDataRelationshipsBuild':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionCreateRequest_data_relationships_build of this AppStoreVersionCreateRequestDataRelationshipsBuild.  # noqa: E501
        :rtype: AppStoreVersionCreateRequestDataRelationshipsBuild
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppRelationshipsBuildsDataInner:
        """Gets the data of this AppStoreVersionCreateRequestDataRelationshipsBuild.


        :return: The data of this AppStoreVersionCreateRequestDataRelationshipsBuild.
        :rtype: AppRelationshipsBuildsDataInner
        """
        return self._data

    @data.setter
    def data(self, data: AppRelationshipsBuildsDataInner):
        """Sets the data of this AppStoreVersionCreateRequestDataRelationshipsBuild.


        :param data: The data of this AppStoreVersionCreateRequestDataRelationshipsBuild.
        :type data: AppRelationshipsBuildsDataInner
        """

        self._data = data
