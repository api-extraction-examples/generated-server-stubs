from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Runtime(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, path=None, runtime_args=None):  # noqa: E501
        """Runtime - a model defined in OpenAPI

        :param path: The path of this Runtime.  # noqa: E501
        :type path: str
        :param runtime_args: The runtime_args of this Runtime.  # noqa: E501
        :type runtime_args: List[str]
        """
        self.openapi_types = {
            'path': str,
            'runtime_args': List[str]
        }

        self.attribute_map = {
            'path': 'path',
            'runtime_args': 'runtimeArgs'
        }

        self._path = path
        self._runtime_args = runtime_args

    @classmethod
    def from_dict(cls, dikt) -> 'Runtime':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Runtime of this Runtime.  # noqa: E501
        :rtype: Runtime
        """
        return util.deserialize_model(dikt, cls)

    @property
    def path(self) -> str:
        """Gets the path of this Runtime.

        Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result.   # noqa: E501

        :return: The path of this Runtime.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this Runtime.

        Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result.   # noqa: E501

        :param path: The path of this Runtime.
        :type path: str
        """

        self._path = path

    @property
    def runtime_args(self) -> List[str]:
        """Gets the runtime_args of this Runtime.

        List of command-line arguments to pass to the runtime when invoked.   # noqa: E501

        :return: The runtime_args of this Runtime.
        :rtype: List[str]
        """
        return self._runtime_args

    @runtime_args.setter
    def runtime_args(self, runtime_args: List[str]):
        """Sets the runtime_args of this Runtime.

        List of command-line arguments to pass to the runtime when invoked.   # noqa: E501

        :param runtime_args: The runtime_args of this Runtime.
        :type runtime_args: List[str]
        """

        self._runtime_args = runtime_args