from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.scroll_direction import ScrollDirection
from openapi_server.models.sort_order import SortOrder
from openapi_server import util

from openapi_server.models.scroll_direction import ScrollDirection  # noqa: E501
from openapi_server.models.sort_order import SortOrder  # noqa: E501

class DisplayPreferencesDto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, client=None, custom_prefs=None, id=None, index_by=None, primary_image_height=None, primary_image_width=None, remember_indexing=None, remember_sorting=None, scroll_direction=None, show_backdrop=None, show_sidebar=None, sort_by=None, sort_order=None, view_type=None):  # noqa: E501
        """DisplayPreferencesDto - a model defined in OpenAPI

        :param client: The client of this DisplayPreferencesDto.  # noqa: E501
        :type client: str
        :param custom_prefs: The custom_prefs of this DisplayPreferencesDto.  # noqa: E501
        :type custom_prefs: Dict[str, str]
        :param id: The id of this DisplayPreferencesDto.  # noqa: E501
        :type id: str
        :param index_by: The index_by of this DisplayPreferencesDto.  # noqa: E501
        :type index_by: str
        :param primary_image_height: The primary_image_height of this DisplayPreferencesDto.  # noqa: E501
        :type primary_image_height: int
        :param primary_image_width: The primary_image_width of this DisplayPreferencesDto.  # noqa: E501
        :type primary_image_width: int
        :param remember_indexing: The remember_indexing of this DisplayPreferencesDto.  # noqa: E501
        :type remember_indexing: bool
        :param remember_sorting: The remember_sorting of this DisplayPreferencesDto.  # noqa: E501
        :type remember_sorting: bool
        :param scroll_direction: The scroll_direction of this DisplayPreferencesDto.  # noqa: E501
        :type scroll_direction: ScrollDirection
        :param show_backdrop: The show_backdrop of this DisplayPreferencesDto.  # noqa: E501
        :type show_backdrop: bool
        :param show_sidebar: The show_sidebar of this DisplayPreferencesDto.  # noqa: E501
        :type show_sidebar: bool
        :param sort_by: The sort_by of this DisplayPreferencesDto.  # noqa: E501
        :type sort_by: str
        :param sort_order: The sort_order of this DisplayPreferencesDto.  # noqa: E501
        :type sort_order: SortOrder
        :param view_type: The view_type of this DisplayPreferencesDto.  # noqa: E501
        :type view_type: str
        """
        self.openapi_types = {
            'client': str,
            'custom_prefs': Dict[str, str],
            'id': str,
            'index_by': str,
            'primary_image_height': int,
            'primary_image_width': int,
            'remember_indexing': bool,
            'remember_sorting': bool,
            'scroll_direction': ScrollDirection,
            'show_backdrop': bool,
            'show_sidebar': bool,
            'sort_by': str,
            'sort_order': SortOrder,
            'view_type': str
        }

        self.attribute_map = {
            'client': 'Client',
            'custom_prefs': 'CustomPrefs',
            'id': 'Id',
            'index_by': 'IndexBy',
            'primary_image_height': 'PrimaryImageHeight',
            'primary_image_width': 'PrimaryImageWidth',
            'remember_indexing': 'RememberIndexing',
            'remember_sorting': 'RememberSorting',
            'scroll_direction': 'ScrollDirection',
            'show_backdrop': 'ShowBackdrop',
            'show_sidebar': 'ShowSidebar',
            'sort_by': 'SortBy',
            'sort_order': 'SortOrder',
            'view_type': 'ViewType'
        }

        self._client = client
        self._custom_prefs = custom_prefs
        self._id = id
        self._index_by = index_by
        self._primary_image_height = primary_image_height
        self._primary_image_width = primary_image_width
        self._remember_indexing = remember_indexing
        self._remember_sorting = remember_sorting
        self._scroll_direction = scroll_direction
        self._show_backdrop = show_backdrop
        self._show_sidebar = show_sidebar
        self._sort_by = sort_by
        self._sort_order = sort_order
        self._view_type = view_type

    @classmethod
    def from_dict(cls, dikt) -> 'DisplayPreferencesDto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DisplayPreferencesDto of this DisplayPreferencesDto.  # noqa: E501
        :rtype: DisplayPreferencesDto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def client(self) -> str:
        """Gets the client of this DisplayPreferencesDto.

        Gets or sets the client.  # noqa: E501

        :return: The client of this DisplayPreferencesDto.
        :rtype: str
        """
        return self._client

    @client.setter
    def client(self, client: str):
        """Sets the client of this DisplayPreferencesDto.

        Gets or sets the client.  # noqa: E501

        :param client: The client of this DisplayPreferencesDto.
        :type client: str
        """

        self._client = client

    @property
    def custom_prefs(self) -> Dict[str, str]:
        """Gets the custom_prefs of this DisplayPreferencesDto.

        Gets or sets the custom prefs.  # noqa: E501

        :return: The custom_prefs of this DisplayPreferencesDto.
        :rtype: Dict[str, str]
        """
        return self._custom_prefs

    @custom_prefs.setter
    def custom_prefs(self, custom_prefs: Dict[str, str]):
        """Sets the custom_prefs of this DisplayPreferencesDto.

        Gets or sets the custom prefs.  # noqa: E501

        :param custom_prefs: The custom_prefs of this DisplayPreferencesDto.
        :type custom_prefs: Dict[str, str]
        """

        self._custom_prefs = custom_prefs

    @property
    def id(self) -> str:
        """Gets the id of this DisplayPreferencesDto.

        Gets or sets the user id.  # noqa: E501

        :return: The id of this DisplayPreferencesDto.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this DisplayPreferencesDto.

        Gets or sets the user id.  # noqa: E501

        :param id: The id of this DisplayPreferencesDto.
        :type id: str
        """

        self._id = id

    @property
    def index_by(self) -> str:
        """Gets the index_by of this DisplayPreferencesDto.

        Gets or sets the index by.  # noqa: E501

        :return: The index_by of this DisplayPreferencesDto.
        :rtype: str
        """
        return self._index_by

    @index_by.setter
    def index_by(self, index_by: str):
        """Sets the index_by of this DisplayPreferencesDto.

        Gets or sets the index by.  # noqa: E501

        :param index_by: The index_by of this DisplayPreferencesDto.
        :type index_by: str
        """

        self._index_by = index_by

    @property
    def primary_image_height(self) -> int:
        """Gets the primary_image_height of this DisplayPreferencesDto.

        Gets or sets the height of the primary image.  # noqa: E501

        :return: The primary_image_height of this DisplayPreferencesDto.
        :rtype: int
        """
        return self._primary_image_height

    @primary_image_height.setter
    def primary_image_height(self, primary_image_height: int):
        """Sets the primary_image_height of this DisplayPreferencesDto.

        Gets or sets the height of the primary image.  # noqa: E501

        :param primary_image_height: The primary_image_height of this DisplayPreferencesDto.
        :type primary_image_height: int
        """

        self._primary_image_height = primary_image_height

    @property
    def primary_image_width(self) -> int:
        """Gets the primary_image_width of this DisplayPreferencesDto.

        Gets or sets the width of the primary image.  # noqa: E501

        :return: The primary_image_width of this DisplayPreferencesDto.
        :rtype: int
        """
        return self._primary_image_width

    @primary_image_width.setter
    def primary_image_width(self, primary_image_width: int):
        """Sets the primary_image_width of this DisplayPreferencesDto.

        Gets or sets the width of the primary image.  # noqa: E501

        :param primary_image_width: The primary_image_width of this DisplayPreferencesDto.
        :type primary_image_width: int
        """

        self._primary_image_width = primary_image_width

    @property
    def remember_indexing(self) -> bool:
        """Gets the remember_indexing of this DisplayPreferencesDto.

        Gets or sets a value indicating whether [remember indexing].  # noqa: E501

        :return: The remember_indexing of this DisplayPreferencesDto.
        :rtype: bool
        """
        return self._remember_indexing

    @remember_indexing.setter
    def remember_indexing(self, remember_indexing: bool):
        """Sets the remember_indexing of this DisplayPreferencesDto.

        Gets or sets a value indicating whether [remember indexing].  # noqa: E501

        :param remember_indexing: The remember_indexing of this DisplayPreferencesDto.
        :type remember_indexing: bool
        """

        self._remember_indexing = remember_indexing

    @property
    def remember_sorting(self) -> bool:
        """Gets the remember_sorting of this DisplayPreferencesDto.

        Gets or sets a value indicating whether [remember sorting].  # noqa: E501

        :return: The remember_sorting of this DisplayPreferencesDto.
        :rtype: bool
        """
        return self._remember_sorting

    @remember_sorting.setter
    def remember_sorting(self, remember_sorting: bool):
        """Sets the remember_sorting of this DisplayPreferencesDto.

        Gets or sets a value indicating whether [remember sorting].  # noqa: E501

        :param remember_sorting: The remember_sorting of this DisplayPreferencesDto.
        :type remember_sorting: bool
        """

        self._remember_sorting = remember_sorting

    @property
    def scroll_direction(self) -> ScrollDirection:
        """Gets the scroll_direction of this DisplayPreferencesDto.


        :return: The scroll_direction of this DisplayPreferencesDto.
        :rtype: ScrollDirection
        """
        return self._scroll_direction

    @scroll_direction.setter
    def scroll_direction(self, scroll_direction: ScrollDirection):
        """Sets the scroll_direction of this DisplayPreferencesDto.


        :param scroll_direction: The scroll_direction of this DisplayPreferencesDto.
        :type scroll_direction: ScrollDirection
        """

        self._scroll_direction = scroll_direction

    @property
    def show_backdrop(self) -> bool:
        """Gets the show_backdrop of this DisplayPreferencesDto.

        Gets or sets a value indicating whether to show backdrops on this item.  # noqa: E501

        :return: The show_backdrop of this DisplayPreferencesDto.
        :rtype: bool
        """
        return self._show_backdrop

    @show_backdrop.setter
    def show_backdrop(self, show_backdrop: bool):
        """Sets the show_backdrop of this DisplayPreferencesDto.

        Gets or sets a value indicating whether to show backdrops on this item.  # noqa: E501

        :param show_backdrop: The show_backdrop of this DisplayPreferencesDto.
        :type show_backdrop: bool
        """

        self._show_backdrop = show_backdrop

    @property
    def show_sidebar(self) -> bool:
        """Gets the show_sidebar of this DisplayPreferencesDto.

        Gets or sets a value indicating whether [show sidebar].  # noqa: E501

        :return: The show_sidebar of this DisplayPreferencesDto.
        :rtype: bool
        """
        return self._show_sidebar

    @show_sidebar.setter
    def show_sidebar(self, show_sidebar: bool):
        """Sets the show_sidebar of this DisplayPreferencesDto.

        Gets or sets a value indicating whether [show sidebar].  # noqa: E501

        :param show_sidebar: The show_sidebar of this DisplayPreferencesDto.
        :type show_sidebar: bool
        """

        self._show_sidebar = show_sidebar

    @property
    def sort_by(self) -> str:
        """Gets the sort_by of this DisplayPreferencesDto.

        Gets or sets the sort by.  # noqa: E501

        :return: The sort_by of this DisplayPreferencesDto.
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by: str):
        """Sets the sort_by of this DisplayPreferencesDto.

        Gets or sets the sort by.  # noqa: E501

        :param sort_by: The sort_by of this DisplayPreferencesDto.
        :type sort_by: str
        """

        self._sort_by = sort_by

    @property
    def sort_order(self) -> SortOrder:
        """Gets the sort_order of this DisplayPreferencesDto.


        :return: The sort_order of this DisplayPreferencesDto.
        :rtype: SortOrder
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order: SortOrder):
        """Sets the sort_order of this DisplayPreferencesDto.


        :param sort_order: The sort_order of this DisplayPreferencesDto.
        :type sort_order: SortOrder
        """

        self._sort_order = sort_order

    @property
    def view_type(self) -> str:
        """Gets the view_type of this DisplayPreferencesDto.

        Gets or sets the type of the view.  # noqa: E501

        :return: The view_type of this DisplayPreferencesDto.
        :rtype: str
        """
        return self._view_type

    @view_type.setter
    def view_type(self, view_type: str):
        """Sets the view_type of this DisplayPreferencesDto.

        Gets or sets the type of the view.  # noqa: E501

        :param view_type: The view_type of this DisplayPreferencesDto.
        :type view_type: str
        """

        self._view_type = view_type