from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.item_urls_inner import ItemUrlsInner
from openapi_server.models.item_vault import ItemVault
import re
from openapi_server import util

from openapi_server.models.item_urls_inner import ItemUrlsInner  # noqa: E501
from openapi_server.models.item_vault import ItemVault  # noqa: E501
import re  # noqa: E501

class Item(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category=None, created_at=None, favorite=False, id=None, last_edited_by=None, state=None, tags=None, title=None, updated_at=None, urls=None, vault=None, version=None):  # noqa: E501
        """Item - a model defined in OpenAPI

        :param category: The category of this Item.  # noqa: E501
        :type category: str
        :param created_at: The created_at of this Item.  # noqa: E501
        :type created_at: datetime
        :param favorite: The favorite of this Item.  # noqa: E501
        :type favorite: bool
        :param id: The id of this Item.  # noqa: E501
        :type id: str
        :param last_edited_by: The last_edited_by of this Item.  # noqa: E501
        :type last_edited_by: str
        :param state: The state of this Item.  # noqa: E501
        :type state: str
        :param tags: The tags of this Item.  # noqa: E501
        :type tags: List[str]
        :param title: The title of this Item.  # noqa: E501
        :type title: str
        :param updated_at: The updated_at of this Item.  # noqa: E501
        :type updated_at: datetime
        :param urls: The urls of this Item.  # noqa: E501
        :type urls: List[ItemUrlsInner]
        :param vault: The vault of this Item.  # noqa: E501
        :type vault: ItemVault
        :param version: The version of this Item.  # noqa: E501
        :type version: int
        """
        self.openapi_types = {
            'category': str,
            'created_at': datetime,
            'favorite': bool,
            'id': str,
            'last_edited_by': str,
            'state': str,
            'tags': List[str],
            'title': str,
            'updated_at': datetime,
            'urls': List[ItemUrlsInner],
            'vault': ItemVault,
            'version': int
        }

        self.attribute_map = {
            'category': 'category',
            'created_at': 'createdAt',
            'favorite': 'favorite',
            'id': 'id',
            'last_edited_by': 'lastEditedBy',
            'state': 'state',
            'tags': 'tags',
            'title': 'title',
            'updated_at': 'updatedAt',
            'urls': 'urls',
            'vault': 'vault',
            'version': 'version'
        }

        self._category = category
        self._created_at = created_at
        self._favorite = favorite
        self._id = id
        self._last_edited_by = last_edited_by
        self._state = state
        self._tags = tags
        self._title = title
        self._updated_at = updated_at
        self._urls = urls
        self._vault = vault
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'Item':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Item of this Item.  # noqa: E501
        :rtype: Item
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category(self) -> str:
        """Gets the category of this Item.


        :return: The category of this Item.
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category: str):
        """Sets the category of this Item.


        :param category: The category of this Item.
        :type category: str
        """
        allowed_values = ["LOGIN", "PASSWORD", "API_CREDENTIAL", "SERVER", "DATABASE", "CREDIT_CARD", "MEMBERSHIP", "PASSPORT", "SOFTWARE_LICENSE", "OUTDOOR_LICENSE", "SECURE_NOTE", "WIRELESS_ROUTER", "BANK_ACCOUNT", "DRIVER_LICENSE", "IDENTITY", "REWARD_PROGRAM", "DOCUMENT", "EMAIL_ACCOUNT", "SOCIAL_SECURITY_NUMBER", "MEDICAL_RECORD", "SSH_KEY", "CUSTOM"]  # noqa: E501
        if category not in allowed_values:
            raise ValueError(
                "Invalid value for `category` ({0}), must be one of {1}"
                .format(category, allowed_values)
            )

        self._category = category

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this Item.


        :return: The created_at of this Item.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this Item.


        :param created_at: The created_at of this Item.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def favorite(self) -> bool:
        """Gets the favorite of this Item.


        :return: The favorite of this Item.
        :rtype: bool
        """
        return self._favorite

    @favorite.setter
    def favorite(self, favorite: bool):
        """Sets the favorite of this Item.


        :param favorite: The favorite of this Item.
        :type favorite: bool
        """

        self._favorite = favorite

    @property
    def id(self) -> str:
        """Gets the id of this Item.


        :return: The id of this Item.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Item.


        :param id: The id of this Item.
        :type id: str
        """
        if id is not None and not re.search(r'^[\da-z]{26}$', id):  # noqa: E501
            raise ValueError("Invalid value for `id`, must be a follow pattern or equal to `/^[\da-z]{26}$/`")  # noqa: E501

        self._id = id

    @property
    def last_edited_by(self) -> str:
        """Gets the last_edited_by of this Item.


        :return: The last_edited_by of this Item.
        :rtype: str
        """
        return self._last_edited_by

    @last_edited_by.setter
    def last_edited_by(self, last_edited_by: str):
        """Sets the last_edited_by of this Item.


        :param last_edited_by: The last_edited_by of this Item.
        :type last_edited_by: str
        """

        self._last_edited_by = last_edited_by

    @property
    def state(self) -> str:
        """Gets the state of this Item.


        :return: The state of this Item.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state: str):
        """Sets the state of this Item.


        :param state: The state of this Item.
        :type state: str
        """
        allowed_values = ["ARCHIVED", "DELETED"]  # noqa: E501
        if state not in allowed_values:
            raise ValueError(
                "Invalid value for `state` ({0}), must be one of {1}"
                .format(state, allowed_values)
            )

        self._state = state

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this Item.


        :return: The tags of this Item.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this Item.


        :param tags: The tags of this Item.
        :type tags: List[str]
        """

        self._tags = tags

    @property
    def title(self) -> str:
        """Gets the title of this Item.


        :return: The title of this Item.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this Item.


        :param title: The title of this Item.
        :type title: str
        """

        self._title = title

    @property
    def updated_at(self) -> datetime:
        """Gets the updated_at of this Item.


        :return: The updated_at of this Item.
        :rtype: datetime
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: datetime):
        """Sets the updated_at of this Item.


        :param updated_at: The updated_at of this Item.
        :type updated_at: datetime
        """

        self._updated_at = updated_at

    @property
    def urls(self) -> List[ItemUrlsInner]:
        """Gets the urls of this Item.


        :return: The urls of this Item.
        :rtype: List[ItemUrlsInner]
        """
        return self._urls

    @urls.setter
    def urls(self, urls: List[ItemUrlsInner]):
        """Sets the urls of this Item.


        :param urls: The urls of this Item.
        :type urls: List[ItemUrlsInner]
        """

        self._urls = urls

    @property
    def vault(self) -> ItemVault:
        """Gets the vault of this Item.


        :return: The vault of this Item.
        :rtype: ItemVault
        """
        return self._vault

    @vault.setter
    def vault(self, vault: ItemVault):
        """Sets the vault of this Item.


        :param vault: The vault of this Item.
        :type vault: ItemVault
        """
        if vault is None:
            raise ValueError("Invalid value for `vault`, must not be `None`")  # noqa: E501

        self._vault = vault

    @property
    def version(self) -> int:
        """Gets the version of this Item.


        :return: The version of this Item.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version: int):
        """Sets the version of this Item.


        :param version: The version of this Item.
        :type version: int
        """

        self._version = version
