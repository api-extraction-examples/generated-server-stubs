from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Artifact(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, node_index=None, path=None, pretty_path=None, url=None):  # noqa: E501
        """Artifact - a model defined in OpenAPI

        :param node_index: The node_index of this Artifact.  # noqa: E501
        :type node_index: int
        :param path: The path of this Artifact.  # noqa: E501
        :type path: str
        :param pretty_path: The pretty_path of this Artifact.  # noqa: E501
        :type pretty_path: str
        :param url: The url of this Artifact.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'node_index': int,
            'path': str,
            'pretty_path': str,
            'url': str
        }

        self.attribute_map = {
            'node_index': 'node_index',
            'path': 'path',
            'pretty_path': 'pretty_path',
            'url': 'url'
        }

        self._node_index = node_index
        self._path = path
        self._pretty_path = pretty_path
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'Artifact':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Artifact of this Artifact.  # noqa: E501
        :rtype: Artifact
        """
        return util.deserialize_model(dikt, cls)

    @property
    def node_index(self) -> int:
        """Gets the node_index of this Artifact.


        :return: The node_index of this Artifact.
        :rtype: int
        """
        return self._node_index

    @node_index.setter
    def node_index(self, node_index: int):
        """Sets the node_index of this Artifact.


        :param node_index: The node_index of this Artifact.
        :type node_index: int
        """

        self._node_index = node_index

    @property
    def path(self) -> str:
        """Gets the path of this Artifact.


        :return: The path of this Artifact.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this Artifact.


        :param path: The path of this Artifact.
        :type path: str
        """

        self._path = path

    @property
    def pretty_path(self) -> str:
        """Gets the pretty_path of this Artifact.


        :return: The pretty_path of this Artifact.
        :rtype: str
        """
        return self._pretty_path

    @pretty_path.setter
    def pretty_path(self, pretty_path: str):
        """Sets the pretty_path of this Artifact.


        :param pretty_path: The pretty_path of this Artifact.
        :type pretty_path: str
        """

        self._pretty_path = pretty_path

    @property
    def url(self) -> str:
        """Gets the url of this Artifact.


        :return: The url of this Artifact.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this Artifact.


        :param url: The url of this Artifact.
        :type url: str
        """

        self._url = url
