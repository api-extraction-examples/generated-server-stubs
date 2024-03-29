from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskSpecLogDriver(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, options=None):  # noqa: E501
        """TaskSpecLogDriver - a model defined in OpenAPI

        :param name: The name of this TaskSpecLogDriver.  # noqa: E501
        :type name: str
        :param options: The options of this TaskSpecLogDriver.  # noqa: E501
        :type options: Dict[str, str]
        """
        self.openapi_types = {
            'name': str,
            'options': Dict[str, str]
        }

        self.attribute_map = {
            'name': 'Name',
            'options': 'Options'
        }

        self._name = name
        self._options = options

    @classmethod
    def from_dict(cls, dikt) -> 'TaskSpecLogDriver':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskSpec_LogDriver of this TaskSpecLogDriver.  # noqa: E501
        :rtype: TaskSpecLogDriver
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this TaskSpecLogDriver.


        :return: The name of this TaskSpecLogDriver.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TaskSpecLogDriver.


        :param name: The name of this TaskSpecLogDriver.
        :type name: str
        """

        self._name = name

    @property
    def options(self) -> Dict[str, str]:
        """Gets the options of this TaskSpecLogDriver.


        :return: The options of this TaskSpecLogDriver.
        :rtype: Dict[str, str]
        """
        return self._options

    @options.setter
    def options(self, options: Dict[str, str]):
        """Sets the options of this TaskSpecLogDriver.


        :param options: The options of this TaskSpecLogDriver.
        :type options: Dict[str, str]
        """

        self._options = options
