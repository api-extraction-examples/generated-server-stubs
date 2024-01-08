from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class WorkManagementNavigationInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, board_name=None):  # noqa: E501
        """WorkManagementNavigationInfo - a model defined in OpenAPI

        :param board_name: The board_name of this WorkManagementNavigationInfo.  # noqa: E501
        :type board_name: str
        """
        self.openapi_types = {
            'board_name': str
        }

        self.attribute_map = {
            'board_name': 'boardName'
        }

        self._board_name = board_name

    @classmethod
    def from_dict(cls, dikt) -> 'WorkManagementNavigationInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkManagementNavigationInfo of this WorkManagementNavigationInfo.  # noqa: E501
        :rtype: WorkManagementNavigationInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def board_name(self) -> str:
        """Gets the board_name of this WorkManagementNavigationInfo.


        :return: The board_name of this WorkManagementNavigationInfo.
        :rtype: str
        """
        return self._board_name

    @board_name.setter
    def board_name(self, board_name: str):
        """Sets the board_name of this WorkManagementNavigationInfo.


        :param board_name: The board_name of this WorkManagementNavigationInfo.
        :type board_name: str
        """

        self._board_name = board_name
