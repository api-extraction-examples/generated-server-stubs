from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Statement(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, actions=None, effect=None, not_actions=None, not_resources=None, resources=None):  # noqa: E501
        """Statement - a model defined in OpenAPI

        :param actions: The actions of this Statement.  # noqa: E501
        :type actions: List[str]
        :param effect: The effect of this Statement.  # noqa: E501
        :type effect: str
        :param not_actions: The not_actions of this Statement.  # noqa: E501
        :type not_actions: List[str]
        :param not_resources: The not_resources of this Statement.  # noqa: E501
        :type not_resources: List[str]
        :param resources: The resources of this Statement.  # noqa: E501
        :type resources: List[str]
        """
        self.openapi_types = {
            'actions': List[str],
            'effect': str,
            'not_actions': List[str],
            'not_resources': List[str],
            'resources': List[str]
        }

        self.attribute_map = {
            'actions': 'actions',
            'effect': 'effect',
            'not_actions': 'notActions',
            'not_resources': 'notResources',
            'resources': 'resources'
        }

        self._actions = actions
        self._effect = effect
        self._not_actions = not_actions
        self._not_resources = not_resources
        self._resources = resources

    @classmethod
    def from_dict(cls, dikt) -> 'Statement':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Statement of this Statement.  # noqa: E501
        :rtype: Statement
        """
        return util.deserialize_model(dikt, cls)

    @property
    def actions(self) -> List[str]:
        """Gets the actions of this Statement.


        :return: The actions of this Statement.
        :rtype: List[str]
        """
        return self._actions

    @actions.setter
    def actions(self, actions: List[str]):
        """Sets the actions of this Statement.


        :param actions: The actions of this Statement.
        :type actions: List[str]
        """

        self._actions = actions

    @property
    def effect(self) -> str:
        """Gets the effect of this Statement.


        :return: The effect of this Statement.
        :rtype: str
        """
        return self._effect

    @effect.setter
    def effect(self, effect: str):
        """Sets the effect of this Statement.


        :param effect: The effect of this Statement.
        :type effect: str
        """
        allowed_values = ["allow", "deny"]  # noqa: E501
        if effect not in allowed_values:
            raise ValueError(
                "Invalid value for `effect` ({0}), must be one of {1}"
                .format(effect, allowed_values)
            )

        self._effect = effect

    @property
    def not_actions(self) -> List[str]:
        """Gets the not_actions of this Statement.

        Targeted actions will be those actions NOT in this list. The \"actions\" field must be empty to use this field.  # noqa: E501

        :return: The not_actions of this Statement.
        :rtype: List[str]
        """
        return self._not_actions

    @not_actions.setter
    def not_actions(self, not_actions: List[str]):
        """Sets the not_actions of this Statement.

        Targeted actions will be those actions NOT in this list. The \"actions\" field must be empty to use this field.  # noqa: E501

        :param not_actions: The not_actions of this Statement.
        :type not_actions: List[str]
        """

        self._not_actions = not_actions

    @property
    def not_resources(self) -> List[str]:
        """Gets the not_resources of this Statement.

        Targeted resource will be those resources NOT in this list. The \"resources`\" field must be empty to use this field.  # noqa: E501

        :return: The not_resources of this Statement.
        :rtype: List[str]
        """
        return self._not_resources

    @not_resources.setter
    def not_resources(self, not_resources: List[str]):
        """Sets the not_resources of this Statement.

        Targeted resource will be those resources NOT in this list. The \"resources`\" field must be empty to use this field.  # noqa: E501

        :param not_resources: The not_resources of this Statement.
        :type not_resources: List[str]
        """

        self._not_resources = not_resources

    @property
    def resources(self) -> List[str]:
        """Gets the resources of this Statement.


        :return: The resources of this Statement.
        :rtype: List[str]
        """
        return self._resources

    @resources.setter
    def resources(self, resources: List[str]):
        """Sets the resources of this Statement.


        :param resources: The resources of this Statement.
        :type resources: List[str]
        """

        self._resources = resources