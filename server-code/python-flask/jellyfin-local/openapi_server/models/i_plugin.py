from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.version import Version
from openapi_server import util

from openapi_server.models.version import Version  # noqa: E501

class IPlugin(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assembly_file_path=None, can_uninstall=None, data_folder_path=None, description=None, id=None, name=None, version=None):  # noqa: E501
        """IPlugin - a model defined in OpenAPI

        :param assembly_file_path: The assembly_file_path of this IPlugin.  # noqa: E501
        :type assembly_file_path: str
        :param can_uninstall: The can_uninstall of this IPlugin.  # noqa: E501
        :type can_uninstall: bool
        :param data_folder_path: The data_folder_path of this IPlugin.  # noqa: E501
        :type data_folder_path: str
        :param description: The description of this IPlugin.  # noqa: E501
        :type description: str
        :param id: The id of this IPlugin.  # noqa: E501
        :type id: str
        :param name: The name of this IPlugin.  # noqa: E501
        :type name: str
        :param version: The version of this IPlugin.  # noqa: E501
        :type version: Version
        """
        self.openapi_types = {
            'assembly_file_path': str,
            'can_uninstall': bool,
            'data_folder_path': str,
            'description': str,
            'id': str,
            'name': str,
            'version': Version
        }

        self.attribute_map = {
            'assembly_file_path': 'AssemblyFilePath',
            'can_uninstall': 'CanUninstall',
            'data_folder_path': 'DataFolderPath',
            'description': 'Description',
            'id': 'Id',
            'name': 'Name',
            'version': 'Version'
        }

        self._assembly_file_path = assembly_file_path
        self._can_uninstall = can_uninstall
        self._data_folder_path = data_folder_path
        self._description = description
        self._id = id
        self._name = name
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'IPlugin':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IPlugin of this IPlugin.  # noqa: E501
        :rtype: IPlugin
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assembly_file_path(self) -> str:
        """Gets the assembly_file_path of this IPlugin.

        Gets the path to the assembly file.  # noqa: E501

        :return: The assembly_file_path of this IPlugin.
        :rtype: str
        """
        return self._assembly_file_path

    @assembly_file_path.setter
    def assembly_file_path(self, assembly_file_path: str):
        """Sets the assembly_file_path of this IPlugin.

        Gets the path to the assembly file.  # noqa: E501

        :param assembly_file_path: The assembly_file_path of this IPlugin.
        :type assembly_file_path: str
        """

        self._assembly_file_path = assembly_file_path

    @property
    def can_uninstall(self) -> bool:
        """Gets the can_uninstall of this IPlugin.

        Gets a value indicating whether the plugin can be uninstalled.  # noqa: E501

        :return: The can_uninstall of this IPlugin.
        :rtype: bool
        """
        return self._can_uninstall

    @can_uninstall.setter
    def can_uninstall(self, can_uninstall: bool):
        """Sets the can_uninstall of this IPlugin.

        Gets a value indicating whether the plugin can be uninstalled.  # noqa: E501

        :param can_uninstall: The can_uninstall of this IPlugin.
        :type can_uninstall: bool
        """

        self._can_uninstall = can_uninstall

    @property
    def data_folder_path(self) -> str:
        """Gets the data_folder_path of this IPlugin.

        Gets the full path to the data folder, where the plugin can store any miscellaneous files needed.  # noqa: E501

        :return: The data_folder_path of this IPlugin.
        :rtype: str
        """
        return self._data_folder_path

    @data_folder_path.setter
    def data_folder_path(self, data_folder_path: str):
        """Sets the data_folder_path of this IPlugin.

        Gets the full path to the data folder, where the plugin can store any miscellaneous files needed.  # noqa: E501

        :param data_folder_path: The data_folder_path of this IPlugin.
        :type data_folder_path: str
        """

        self._data_folder_path = data_folder_path

    @property
    def description(self) -> str:
        """Gets the description of this IPlugin.

        Gets the Description.  # noqa: E501

        :return: The description of this IPlugin.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this IPlugin.

        Gets the Description.  # noqa: E501

        :param description: The description of this IPlugin.
        :type description: str
        """

        self._description = description

    @property
    def id(self) -> str:
        """Gets the id of this IPlugin.

        Gets the unique id.  # noqa: E501

        :return: The id of this IPlugin.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this IPlugin.

        Gets the unique id.  # noqa: E501

        :param id: The id of this IPlugin.
        :type id: str
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this IPlugin.

        Gets the name of the plugin.  # noqa: E501

        :return: The name of this IPlugin.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this IPlugin.

        Gets the name of the plugin.  # noqa: E501

        :param name: The name of this IPlugin.
        :type name: str
        """

        self._name = name

    @property
    def version(self) -> Version:
        """Gets the version of this IPlugin.


        :return: The version of this IPlugin.
        :rtype: Version
        """
        return self._version

    @version.setter
    def version(self, version: Version):
        """Sets the version of this IPlugin.


        :param version: The version of this IPlugin.
        :type version: Version
        """

        self._version = version
