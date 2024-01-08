from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.scope import Scope
from openapi_server.models.screenable_tab import ScreenableTab
from openapi_server import util

from openapi_server.models.scope import Scope  # noqa: E501
from openapi_server.models.screenable_tab import ScreenableTab  # noqa: E501

class ScreenWithTab(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, id=None, name=None, scope=None, tab=None):  # noqa: E501
        """ScreenWithTab - a model defined in OpenAPI

        :param description: The description of this ScreenWithTab.  # noqa: E501
        :type description: str
        :param id: The id of this ScreenWithTab.  # noqa: E501
        :type id: int
        :param name: The name of this ScreenWithTab.  # noqa: E501
        :type name: str
        :param scope: The scope of this ScreenWithTab.  # noqa: E501
        :type scope: Scope
        :param tab: The tab of this ScreenWithTab.  # noqa: E501
        :type tab: ScreenableTab
        """
        self.openapi_types = {
            'description': str,
            'id': int,
            'name': str,
            'scope': Scope,
            'tab': ScreenableTab
        }

        self.attribute_map = {
            'description': 'description',
            'id': 'id',
            'name': 'name',
            'scope': 'scope',
            'tab': 'tab'
        }

        self._description = description
        self._id = id
        self._name = name
        self._scope = scope
        self._tab = tab

    @classmethod
    def from_dict(cls, dikt) -> 'ScreenWithTab':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ScreenWithTab of this ScreenWithTab.  # noqa: E501
        :rtype: ScreenWithTab
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this ScreenWithTab.

        The description of the screen.  # noqa: E501

        :return: The description of this ScreenWithTab.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ScreenWithTab.

        The description of the screen.  # noqa: E501

        :param description: The description of this ScreenWithTab.
        :type description: str
        """

        self._description = description

    @property
    def id(self) -> int:
        """Gets the id of this ScreenWithTab.

        The ID of the screen.  # noqa: E501

        :return: The id of this ScreenWithTab.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this ScreenWithTab.

        The ID of the screen.  # noqa: E501

        :param id: The id of this ScreenWithTab.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this ScreenWithTab.

        The name of the screen.  # noqa: E501

        :return: The name of this ScreenWithTab.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ScreenWithTab.

        The name of the screen.  # noqa: E501

        :param name: The name of this ScreenWithTab.
        :type name: str
        """

        self._name = name

    @property
    def scope(self) -> Scope:
        """Gets the scope of this ScreenWithTab.


        :return: The scope of this ScreenWithTab.
        :rtype: Scope
        """
        return self._scope

    @scope.setter
    def scope(self, scope: Scope):
        """Sets the scope of this ScreenWithTab.


        :param scope: The scope of this ScreenWithTab.
        :type scope: Scope
        """

        self._scope = scope

    @property
    def tab(self) -> ScreenableTab:
        """Gets the tab of this ScreenWithTab.


        :return: The tab of this ScreenWithTab.
        :rtype: ScreenableTab
        """
        return self._tab

    @tab.setter
    def tab(self, tab: ScreenableTab):
        """Sets the tab of this ScreenWithTab.


        :param tab: The tab of this ScreenWithTab.
        :type tab: ScreenableTab
        """

        self._tab = tab