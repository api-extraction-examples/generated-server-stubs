from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BuildHookSetup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, branch=None, title=None):  # noqa: E501
        """BuildHookSetup - a model defined in OpenAPI

        :param branch: The branch of this BuildHookSetup.  # noqa: E501
        :type branch: str
        :param title: The title of this BuildHookSetup.  # noqa: E501
        :type title: str
        """
        self.openapi_types = {
            'branch': str,
            'title': str
        }

        self.attribute_map = {
            'branch': 'branch',
            'title': 'title'
        }

        self._branch = branch
        self._title = title

    @classmethod
    def from_dict(cls, dikt) -> 'BuildHookSetup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The buildHookSetup of this BuildHookSetup.  # noqa: E501
        :rtype: BuildHookSetup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def branch(self) -> str:
        """Gets the branch of this BuildHookSetup.


        :return: The branch of this BuildHookSetup.
        :rtype: str
        """
        return self._branch

    @branch.setter
    def branch(self, branch: str):
        """Sets the branch of this BuildHookSetup.


        :param branch: The branch of this BuildHookSetup.
        :type branch: str
        """

        self._branch = branch

    @property
    def title(self) -> str:
        """Gets the title of this BuildHookSetup.


        :return: The title of this BuildHookSetup.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this BuildHookSetup.


        :param title: The title of this BuildHookSetup.
        :type title: str
        """

        self._title = title