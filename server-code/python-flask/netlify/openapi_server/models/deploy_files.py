from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.function_config import FunctionConfig
from openapi_server.models.function_schedule import FunctionSchedule
from openapi_server import util

from openapi_server.models.function_config import FunctionConfig  # noqa: E501
from openapi_server.models.function_schedule import FunctionSchedule  # noqa: E501

class DeployFiles(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _async=None, branch=None, draft=None, files=None, framework=None, function_schedules=None, functions=None, functions_config=None):  # noqa: E501
        """DeployFiles - a model defined in OpenAPI

        :param _async: The _async of this DeployFiles.  # noqa: E501
        :type _async: bool
        :param branch: The branch of this DeployFiles.  # noqa: E501
        :type branch: str
        :param draft: The draft of this DeployFiles.  # noqa: E501
        :type draft: bool
        :param files: The files of this DeployFiles.  # noqa: E501
        :type files: object
        :param framework: The framework of this DeployFiles.  # noqa: E501
        :type framework: str
        :param function_schedules: The function_schedules of this DeployFiles.  # noqa: E501
        :type function_schedules: List[FunctionSchedule]
        :param functions: The functions of this DeployFiles.  # noqa: E501
        :type functions: object
        :param functions_config: The functions_config of this DeployFiles.  # noqa: E501
        :type functions_config: Dict[str, FunctionConfig]
        """
        self.openapi_types = {
            '_async': bool,
            'branch': str,
            'draft': bool,
            'files': object,
            'framework': str,
            'function_schedules': List[FunctionSchedule],
            'functions': object,
            'functions_config': Dict[str, FunctionConfig]
        }

        self.attribute_map = {
            '_async': 'async',
            'branch': 'branch',
            'draft': 'draft',
            'files': 'files',
            'framework': 'framework',
            'function_schedules': 'function_schedules',
            'functions': 'functions',
            'functions_config': 'functions_config'
        }

        self.__async = _async
        self._branch = branch
        self._draft = draft
        self._files = files
        self._framework = framework
        self._function_schedules = function_schedules
        self._functions = functions
        self._functions_config = functions_config

    @classmethod
    def from_dict(cls, dikt) -> 'DeployFiles':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The deployFiles of this DeployFiles.  # noqa: E501
        :rtype: DeployFiles
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _async(self) -> bool:
        """Gets the _async of this DeployFiles.


        :return: The _async of this DeployFiles.
        :rtype: bool
        """
        return self.__async

    @_async.setter
    def _async(self, _async: bool):
        """Sets the _async of this DeployFiles.


        :param _async: The _async of this DeployFiles.
        :type _async: bool
        """

        self.__async = _async

    @property
    def branch(self) -> str:
        """Gets the branch of this DeployFiles.


        :return: The branch of this DeployFiles.
        :rtype: str
        """
        return self._branch

    @branch.setter
    def branch(self, branch: str):
        """Sets the branch of this DeployFiles.


        :param branch: The branch of this DeployFiles.
        :type branch: str
        """

        self._branch = branch

    @property
    def draft(self) -> bool:
        """Gets the draft of this DeployFiles.


        :return: The draft of this DeployFiles.
        :rtype: bool
        """
        return self._draft

    @draft.setter
    def draft(self, draft: bool):
        """Sets the draft of this DeployFiles.


        :param draft: The draft of this DeployFiles.
        :type draft: bool
        """

        self._draft = draft

    @property
    def files(self) -> object:
        """Gets the files of this DeployFiles.


        :return: The files of this DeployFiles.
        :rtype: object
        """
        return self._files

    @files.setter
    def files(self, files: object):
        """Sets the files of this DeployFiles.


        :param files: The files of this DeployFiles.
        :type files: object
        """

        self._files = files

    @property
    def framework(self) -> str:
        """Gets the framework of this DeployFiles.


        :return: The framework of this DeployFiles.
        :rtype: str
        """
        return self._framework

    @framework.setter
    def framework(self, framework: str):
        """Sets the framework of this DeployFiles.


        :param framework: The framework of this DeployFiles.
        :type framework: str
        """

        self._framework = framework

    @property
    def function_schedules(self) -> List[FunctionSchedule]:
        """Gets the function_schedules of this DeployFiles.


        :return: The function_schedules of this DeployFiles.
        :rtype: List[FunctionSchedule]
        """
        return self._function_schedules

    @function_schedules.setter
    def function_schedules(self, function_schedules: List[FunctionSchedule]):
        """Sets the function_schedules of this DeployFiles.


        :param function_schedules: The function_schedules of this DeployFiles.
        :type function_schedules: List[FunctionSchedule]
        """

        self._function_schedules = function_schedules

    @property
    def functions(self) -> object:
        """Gets the functions of this DeployFiles.


        :return: The functions of this DeployFiles.
        :rtype: object
        """
        return self._functions

    @functions.setter
    def functions(self, functions: object):
        """Sets the functions of this DeployFiles.


        :param functions: The functions of this DeployFiles.
        :type functions: object
        """

        self._functions = functions

    @property
    def functions_config(self) -> Dict[str, FunctionConfig]:
        """Gets the functions_config of this DeployFiles.


        :return: The functions_config of this DeployFiles.
        :rtype: Dict[str, FunctionConfig]
        """
        return self._functions_config

    @functions_config.setter
    def functions_config(self, functions_config: Dict[str, FunctionConfig]):
        """Sets the functions_config of this DeployFiles.


        :param functions_config: The functions_config of this DeployFiles.
        :type functions_config: Dict[str, FunctionConfig]
        """

        self._functions_config = functions_config
