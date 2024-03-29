from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BuildHook(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, branch=None, created_at=None, id=None, site_id=None, title=None, url=None):  # noqa: E501
        """BuildHook - a model defined in OpenAPI

        :param branch: The branch of this BuildHook.  # noqa: E501
        :type branch: str
        :param created_at: The created_at of this BuildHook.  # noqa: E501
        :type created_at: str
        :param id: The id of this BuildHook.  # noqa: E501
        :type id: str
        :param site_id: The site_id of this BuildHook.  # noqa: E501
        :type site_id: str
        :param title: The title of this BuildHook.  # noqa: E501
        :type title: str
        :param url: The url of this BuildHook.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'branch': str,
            'created_at': str,
            'id': str,
            'site_id': str,
            'title': str,
            'url': str
        }

        self.attribute_map = {
            'branch': 'branch',
            'created_at': 'created_at',
            'id': 'id',
            'site_id': 'site_id',
            'title': 'title',
            'url': 'url'
        }

        self._branch = branch
        self._created_at = created_at
        self._id = id
        self._site_id = site_id
        self._title = title
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'BuildHook':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The buildHook of this BuildHook.  # noqa: E501
        :rtype: BuildHook
        """
        return util.deserialize_model(dikt, cls)

    @property
    def branch(self) -> str:
        """Gets the branch of this BuildHook.


        :return: The branch of this BuildHook.
        :rtype: str
        """
        return self._branch

    @branch.setter
    def branch(self, branch: str):
        """Sets the branch of this BuildHook.


        :param branch: The branch of this BuildHook.
        :type branch: str
        """

        self._branch = branch

    @property
    def created_at(self) -> str:
        """Gets the created_at of this BuildHook.


        :return: The created_at of this BuildHook.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this BuildHook.


        :param created_at: The created_at of this BuildHook.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def id(self) -> str:
        """Gets the id of this BuildHook.


        :return: The id of this BuildHook.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BuildHook.


        :param id: The id of this BuildHook.
        :type id: str
        """

        self._id = id

    @property
    def site_id(self) -> str:
        """Gets the site_id of this BuildHook.


        :return: The site_id of this BuildHook.
        :rtype: str
        """
        return self._site_id

    @site_id.setter
    def site_id(self, site_id: str):
        """Sets the site_id of this BuildHook.


        :param site_id: The site_id of this BuildHook.
        :type site_id: str
        """

        self._site_id = site_id

    @property
    def title(self) -> str:
        """Gets the title of this BuildHook.


        :return: The title of this BuildHook.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this BuildHook.


        :param title: The title of this BuildHook.
        :type title: str
        """

        self._title = title

    @property
    def url(self) -> str:
        """Gets the url of this BuildHook.


        :return: The url of this BuildHook.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this BuildHook.


        :param url: The url of this BuildHook.
        :type url: str
        """

        self._url = url
