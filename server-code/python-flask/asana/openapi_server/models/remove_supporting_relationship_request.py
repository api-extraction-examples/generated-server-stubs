from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.goal_remove_supporting_relationship_request import GoalRemoveSupportingRelationshipRequest
from openapi_server import util

from openapi_server.models.goal_remove_supporting_relationship_request import GoalRemoveSupportingRelationshipRequest  # noqa: E501

class RemoveSupportingRelationshipRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """RemoveSupportingRelationshipRequest - a model defined in OpenAPI

        :param data: The data of this RemoveSupportingRelationshipRequest.  # noqa: E501
        :type data: GoalRemoveSupportingRelationshipRequest
        """
        self.openapi_types = {
            'data': GoalRemoveSupportingRelationshipRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'RemoveSupportingRelationshipRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The removeSupportingRelationship_request of this RemoveSupportingRelationshipRequest.  # noqa: E501
        :rtype: RemoveSupportingRelationshipRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> GoalRemoveSupportingRelationshipRequest:
        """Gets the data of this RemoveSupportingRelationshipRequest.


        :return: The data of this RemoveSupportingRelationshipRequest.
        :rtype: GoalRemoveSupportingRelationshipRequest
        """
        return self._data

    @data.setter
    def data(self, data: GoalRemoveSupportingRelationshipRequest):
        """Sets the data of this RemoveSupportingRelationshipRequest.


        :param data: The data of this RemoveSupportingRelationshipRequest.
        :type data: GoalRemoveSupportingRelationshipRequest
        """

        self._data = data