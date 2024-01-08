from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_beta_groups_data_inner import AppRelationshipsBetaGroupsDataInner
from openapi_server import util

from openapi_server.models.app_relationships_beta_groups_data_inner import AppRelationshipsBetaGroupsDataInner  # noqa: E501

class BetaTesterCreateRequestDataRelationshipsBetaGroups(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """BetaTesterCreateRequestDataRelationshipsBetaGroups - a model defined in OpenAPI

        :param data: The data of this BetaTesterCreateRequestDataRelationshipsBetaGroups.  # noqa: E501
        :type data: List[AppRelationshipsBetaGroupsDataInner]
        """
        self.openapi_types = {
            'data': List[AppRelationshipsBetaGroupsDataInner]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'BetaTesterCreateRequestDataRelationshipsBetaGroups':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaTesterCreateRequest_data_relationships_betaGroups of this BetaTesterCreateRequestDataRelationshipsBetaGroups.  # noqa: E501
        :rtype: BetaTesterCreateRequestDataRelationshipsBetaGroups
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppRelationshipsBetaGroupsDataInner]:
        """Gets the data of this BetaTesterCreateRequestDataRelationshipsBetaGroups.


        :return: The data of this BetaTesterCreateRequestDataRelationshipsBetaGroups.
        :rtype: List[AppRelationshipsBetaGroupsDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppRelationshipsBetaGroupsDataInner]):
        """Sets the data of this BetaTesterCreateRequestDataRelationshipsBetaGroups.


        :param data: The data of this BetaTesterCreateRequestDataRelationshipsBetaGroups.
        :type data: List[AppRelationshipsBetaGroupsDataInner]
        """

        self._data = data