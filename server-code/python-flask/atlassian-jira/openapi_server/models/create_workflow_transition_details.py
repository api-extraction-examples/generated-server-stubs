from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_workflow_transition_rules_details import CreateWorkflowTransitionRulesDetails
from openapi_server.models.create_workflow_transition_screen_details import CreateWorkflowTransitionScreenDetails
from openapi_server import util

from openapi_server.models.create_workflow_transition_rules_details import CreateWorkflowTransitionRulesDetails  # noqa: E501
from openapi_server.models.create_workflow_transition_screen_details import CreateWorkflowTransitionScreenDetails  # noqa: E501

class CreateWorkflowTransitionDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, _from=None, name=None, properties=None, rules=None, screen=None, to=None, type=None):  # noqa: E501
        """CreateWorkflowTransitionDetails - a model defined in OpenAPI

        :param description: The description of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type description: str
        :param _from: The _from of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type _from: List[str]
        :param name: The name of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type name: str
        :param properties: The properties of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type properties: Dict[str, str]
        :param rules: The rules of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type rules: CreateWorkflowTransitionRulesDetails
        :param screen: The screen of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type screen: CreateWorkflowTransitionScreenDetails
        :param to: The to of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type to: str
        :param type: The type of this CreateWorkflowTransitionDetails.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'description': str,
            '_from': List[str],
            'name': str,
            'properties': Dict[str, str],
            'rules': CreateWorkflowTransitionRulesDetails,
            'screen': CreateWorkflowTransitionScreenDetails,
            'to': str,
            'type': str
        }

        self.attribute_map = {
            'description': 'description',
            '_from': 'from',
            'name': 'name',
            'properties': 'properties',
            'rules': 'rules',
            'screen': 'screen',
            'to': 'to',
            'type': 'type'
        }

        self._description = description
        self.__from = _from
        self._name = name
        self._properties = properties
        self._rules = rules
        self._screen = screen
        self._to = to
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'CreateWorkflowTransitionDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateWorkflowTransitionDetails of this CreateWorkflowTransitionDetails.  # noqa: E501
        :rtype: CreateWorkflowTransitionDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this CreateWorkflowTransitionDetails.

        The description of the transition. The maximum length is 1000 characters.  # noqa: E501

        :return: The description of this CreateWorkflowTransitionDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CreateWorkflowTransitionDetails.

        The description of the transition. The maximum length is 1000 characters.  # noqa: E501

        :param description: The description of this CreateWorkflowTransitionDetails.
        :type description: str
        """

        self._description = description

    @property
    def _from(self) -> List[str]:
        """Gets the _from of this CreateWorkflowTransitionDetails.

        The statuses the transition can start from.  # noqa: E501

        :return: The _from of this CreateWorkflowTransitionDetails.
        :rtype: List[str]
        """
        return self.__from

    @_from.setter
    def _from(self, _from: List[str]):
        """Sets the _from of this CreateWorkflowTransitionDetails.

        The statuses the transition can start from.  # noqa: E501

        :param _from: The _from of this CreateWorkflowTransitionDetails.
        :type _from: List[str]
        """

        self.__from = _from

    @property
    def name(self) -> str:
        """Gets the name of this CreateWorkflowTransitionDetails.

        The name of the transition. The maximum length is 60 characters.  # noqa: E501

        :return: The name of this CreateWorkflowTransitionDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateWorkflowTransitionDetails.

        The name of the transition. The maximum length is 60 characters.  # noqa: E501

        :param name: The name of this CreateWorkflowTransitionDetails.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def properties(self) -> Dict[str, str]:
        """Gets the properties of this CreateWorkflowTransitionDetails.

        The properties of the transition.  # noqa: E501

        :return: The properties of this CreateWorkflowTransitionDetails.
        :rtype: Dict[str, str]
        """
        return self._properties

    @properties.setter
    def properties(self, properties: Dict[str, str]):
        """Sets the properties of this CreateWorkflowTransitionDetails.

        The properties of the transition.  # noqa: E501

        :param properties: The properties of this CreateWorkflowTransitionDetails.
        :type properties: Dict[str, str]
        """

        self._properties = properties

    @property
    def rules(self) -> CreateWorkflowTransitionRulesDetails:
        """Gets the rules of this CreateWorkflowTransitionDetails.


        :return: The rules of this CreateWorkflowTransitionDetails.
        :rtype: CreateWorkflowTransitionRulesDetails
        """
        return self._rules

    @rules.setter
    def rules(self, rules: CreateWorkflowTransitionRulesDetails):
        """Sets the rules of this CreateWorkflowTransitionDetails.


        :param rules: The rules of this CreateWorkflowTransitionDetails.
        :type rules: CreateWorkflowTransitionRulesDetails
        """

        self._rules = rules

    @property
    def screen(self) -> CreateWorkflowTransitionScreenDetails:
        """Gets the screen of this CreateWorkflowTransitionDetails.


        :return: The screen of this CreateWorkflowTransitionDetails.
        :rtype: CreateWorkflowTransitionScreenDetails
        """
        return self._screen

    @screen.setter
    def screen(self, screen: CreateWorkflowTransitionScreenDetails):
        """Sets the screen of this CreateWorkflowTransitionDetails.


        :param screen: The screen of this CreateWorkflowTransitionDetails.
        :type screen: CreateWorkflowTransitionScreenDetails
        """

        self._screen = screen

    @property
    def to(self) -> str:
        """Gets the to of this CreateWorkflowTransitionDetails.

        The status the transition goes to.  # noqa: E501

        :return: The to of this CreateWorkflowTransitionDetails.
        :rtype: str
        """
        return self._to

    @to.setter
    def to(self, to: str):
        """Sets the to of this CreateWorkflowTransitionDetails.

        The status the transition goes to.  # noqa: E501

        :param to: The to of this CreateWorkflowTransitionDetails.
        :type to: str
        """
        if to is None:
            raise ValueError("Invalid value for `to`, must not be `None`")  # noqa: E501

        self._to = to

    @property
    def type(self) -> str:
        """Gets the type of this CreateWorkflowTransitionDetails.

        The type of the transition.  # noqa: E501

        :return: The type of this CreateWorkflowTransitionDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this CreateWorkflowTransitionDetails.

        The type of the transition.  # noqa: E501

        :param type: The type of this CreateWorkflowTransitionDetails.
        :type type: str
        """
        allowed_values = ["global", "initial", "directed"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type