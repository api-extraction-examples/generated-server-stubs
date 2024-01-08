from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.goal_relationship_compact import GoalRelationshipCompact
from openapi_server import util

from openapi_server.models.goal_relationship_compact import GoalRelationshipCompact  # noqa: E501

class GetGoalRelationships200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetGoalRelationships200Response - a model defined in OpenAPI

        :param data: The data of this GetGoalRelationships200Response.  # noqa: E501
        :type data: List[GoalRelationshipCompact]
        """
        self.openapi_types = {
            'data': List[GoalRelationshipCompact]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetGoalRelationships200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getGoalRelationships_200_response of this GetGoalRelationships200Response.  # noqa: E501
        :rtype: GetGoalRelationships200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[GoalRelationshipCompact]:
        """Gets the data of this GetGoalRelationships200Response.


        :return: The data of this GetGoalRelationships200Response.
        :rtype: List[GoalRelationshipCompact]
        """
        return self._data

    @data.setter
    def data(self, data: List[GoalRelationshipCompact]):
        """Sets the data of this GetGoalRelationships200Response.


        :param data: The data of this GetGoalRelationships200Response.
        :type data: List[GoalRelationshipCompact]
        """

        self._data = data