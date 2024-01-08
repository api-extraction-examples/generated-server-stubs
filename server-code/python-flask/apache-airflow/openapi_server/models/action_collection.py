from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.action import Action
from openapi_server import util

from openapi_server.models.action import Action  # noqa: E501

class ActionCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_entries=None, actions=None):  # noqa: E501
        """ActionCollection - a model defined in OpenAPI

        :param total_entries: The total_entries of this ActionCollection.  # noqa: E501
        :type total_entries: int
        :param actions: The actions of this ActionCollection.  # noqa: E501
        :type actions: List[Action]
        """
        self.openapi_types = {
            'total_entries': int,
            'actions': List[Action]
        }

        self.attribute_map = {
            'total_entries': 'total_entries',
            'actions': 'actions'
        }

        self._total_entries = total_entries
        self._actions = actions

    @classmethod
    def from_dict(cls, dikt) -> 'ActionCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ActionCollection of this ActionCollection.  # noqa: E501
        :rtype: ActionCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_entries(self) -> int:
        """Gets the total_entries of this ActionCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :return: The total_entries of this ActionCollection.
        :rtype: int
        """
        return self._total_entries

    @total_entries.setter
    def total_entries(self, total_entries: int):
        """Sets the total_entries of this ActionCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :param total_entries: The total_entries of this ActionCollection.
        :type total_entries: int
        """

        self._total_entries = total_entries

    @property
    def actions(self) -> List[Action]:
        """Gets the actions of this ActionCollection.


        :return: The actions of this ActionCollection.
        :rtype: List[Action]
        """
        return self._actions

    @actions.setter
    def actions(self, actions: List[Action]):
        """Sets the actions of this ActionCollection.


        :param actions: The actions of this ActionCollection.
        :type actions: List[Action]
        """

        self._actions = actions