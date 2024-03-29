from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PlayableItem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, image_url=None, pid=None, title=None, type=None, version_pid=None):  # noqa: E501
        """PlayableItem - a model defined in OpenAPI

        :param description: The description of this PlayableItem.  # noqa: E501
        :type description: str
        :param image_url: The image_url of this PlayableItem.  # noqa: E501
        :type image_url: str
        :param pid: The pid of this PlayableItem.  # noqa: E501
        :type pid: str
        :param title: The title of this PlayableItem.  # noqa: E501
        :type title: str
        :param type: The type of this PlayableItem.  # noqa: E501
        :type type: str
        :param version_pid: The version_pid of this PlayableItem.  # noqa: E501
        :type version_pid: str
        """
        self.openapi_types = {
            'description': str,
            'image_url': str,
            'pid': str,
            'title': str,
            'type': str,
            'version_pid': str
        }

        self.attribute_map = {
            'description': 'description',
            'image_url': 'image_url',
            'pid': 'pid',
            'title': 'title',
            'type': 'type',
            'version_pid': 'version_pid'
        }

        self._description = description
        self._image_url = image_url
        self._pid = pid
        self._title = title
        self._type = type
        self._version_pid = version_pid

    @classmethod
    def from_dict(cls, dikt) -> 'PlayableItem':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PlayableItem of this PlayableItem.  # noqa: E501
        :rtype: PlayableItem
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this PlayableItem.


        :return: The description of this PlayableItem.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this PlayableItem.


        :param description: The description of this PlayableItem.
        :type description: str
        """

        self._description = description

    @property
    def image_url(self) -> str:
        """Gets the image_url of this PlayableItem.


        :return: The image_url of this PlayableItem.
        :rtype: str
        """
        return self._image_url

    @image_url.setter
    def image_url(self, image_url: str):
        """Sets the image_url of this PlayableItem.


        :param image_url: The image_url of this PlayableItem.
        :type image_url: str
        """

        self._image_url = image_url

    @property
    def pid(self) -> str:
        """Gets the pid of this PlayableItem.


        :return: The pid of this PlayableItem.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this PlayableItem.


        :param pid: The pid of this PlayableItem.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this PlayableItem.


        :return: The title of this PlayableItem.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this PlayableItem.


        :param title: The title of this PlayableItem.
        :type title: str
        """

        self._title = title

    @property
    def type(self) -> str:
        """Gets the type of this PlayableItem.


        :return: The type of this PlayableItem.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PlayableItem.


        :param type: The type of this PlayableItem.
        :type type: str
        """

        self._type = type

    @property
    def version_pid(self) -> str:
        """Gets the version_pid of this PlayableItem.


        :return: The version_pid of this PlayableItem.
        :rtype: str
        """
        return self._version_pid

    @version_pid.setter
    def version_pid(self, version_pid: str):
        """Sets the version_pid of this PlayableItem.


        :param version_pid: The version_pid of this PlayableItem.
        :type version_pid: str
        """

        self._version_pid = version_pid
