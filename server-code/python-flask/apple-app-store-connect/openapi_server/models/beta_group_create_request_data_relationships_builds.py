from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_builds_data_inner import AppRelationshipsBuildsDataInner
from openapi_server import util

from openapi_server.models.app_relationships_builds_data_inner import AppRelationshipsBuildsDataInner  # noqa: E501

class BetaGroupCreateRequestDataRelationshipsBuilds(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """BetaGroupCreateRequestDataRelationshipsBuilds - a model defined in OpenAPI

        :param data: The data of this BetaGroupCreateRequestDataRelationshipsBuilds.  # noqa: E501
        :type data: List[AppRelationshipsBuildsDataInner]
        """
        self.openapi_types = {
            'data': List[AppRelationshipsBuildsDataInner]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'BetaGroupCreateRequestDataRelationshipsBuilds':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaGroupCreateRequest_data_relationships_builds of this BetaGroupCreateRequestDataRelationshipsBuilds.  # noqa: E501
        :rtype: BetaGroupCreateRequestDataRelationshipsBuilds
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppRelationshipsBuildsDataInner]:
        """Gets the data of this BetaGroupCreateRequestDataRelationshipsBuilds.


        :return: The data of this BetaGroupCreateRequestDataRelationshipsBuilds.
        :rtype: List[AppRelationshipsBuildsDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppRelationshipsBuildsDataInner]):
        """Sets the data of this BetaGroupCreateRequestDataRelationshipsBuilds.


        :param data: The data of this BetaGroupCreateRequestDataRelationshipsBuilds.
        :type data: List[AppRelationshipsBuildsDataInner]
        """

        self._data = data
