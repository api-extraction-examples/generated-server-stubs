from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Driver(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, options=None):  # noqa: E501
        """Driver - a model defined in OpenAPI

        :param name: The name of this Driver.  # noqa: E501
        :type name: str
        :param options: The options of this Driver.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'Driver':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Driver of this Driver.  # noqa: E501
        :rtype: Driver
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this Driver.

        Name of the driver.  # noqa: E501

        :return: The name of this Driver.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Driver.

        Name of the driver.  # noqa: E501

        :param name: The name of this Driver.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def options(self) -> Dict[str, str]:
        """Gets the options of this Driver.

        Key/value map of driver-specific options.  # noqa: E501

        :return: The options of this Driver.
        :rtype: Dict[str, str]
        """
        return self._options

    @options.setter
    def options(self, options: Dict[str, str]):
        """Sets the options of this Driver.

        Key/value map of driver-specific options.  # noqa: E501

        :param options: The options of this Driver.
        :type options: Dict[str, str]
        """

        self._options = options