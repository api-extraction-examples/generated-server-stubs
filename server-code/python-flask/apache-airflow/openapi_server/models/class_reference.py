from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ClassReference(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, class_name=None, module_path=None):  # noqa: E501
        """ClassReference - a model defined in OpenAPI

        :param class_name: The class_name of this ClassReference.  # noqa: E501
        :type class_name: str
        :param module_path: The module_path of this ClassReference.  # noqa: E501
        :type module_path: str
        """
        self.openapi_types = {
            'class_name': str,
            'module_path': str
        }

        self.attribute_map = {
            'class_name': 'class_name',
            'module_path': 'module_path'
        }

        self._class_name = class_name
        self._module_path = module_path

    @classmethod
    def from_dict(cls, dikt) -> 'ClassReference':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ClassReference of this ClassReference.  # noqa: E501
        :rtype: ClassReference
        """
        return util.deserialize_model(dikt, cls)

    @property
    def class_name(self) -> str:
        """Gets the class_name of this ClassReference.


        :return: The class_name of this ClassReference.
        :rtype: str
        """
        return self._class_name

    @class_name.setter
    def class_name(self, class_name: str):
        """Sets the class_name of this ClassReference.


        :param class_name: The class_name of this ClassReference.
        :type class_name: str
        """

        self._class_name = class_name

    @property
    def module_path(self) -> str:
        """Gets the module_path of this ClassReference.


        :return: The module_path of this ClassReference.
        :rtype: str
        """
        return self._module_path

    @module_path.setter
    def module_path(self, module_path: str):
        """Sets the module_path of this ClassReference.


        :param module_path: The module_path of this ClassReference.
        :type module_path: str
        """

        self._module_path = module_path
