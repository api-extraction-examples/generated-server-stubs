from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.emoji import Emoji
from openapi_server.models.field import Field
from openapi_server.models.source import Source
from openapi_server import util

from openapi_server.models.emoji import Emoji  # noqa: E501
from openapi_server.models.field import Field  # noqa: E501
from openapi_server.models.source import Source  # noqa: E501

class Account(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, acct=None, avatar=None, avatar_static=None, bot=None, created_at=None, discoverable=None, display_name=None, emojis=None, fields=None, followers_count=None, following_count=None, header=None, header_static=None, id=None, last_status_at=None, locked=None, moved=None, mute_expires_at=None, note=None, source=None, statuses_count=None, suspended=None, url=None, username=None):  # noqa: E501
        """Account - a model defined in OpenAPI

        :param acct: The acct of this Account.  # noqa: E501
        :type acct: str
        :param avatar: The avatar of this Account.  # noqa: E501
        :type avatar: str
        :param avatar_static: The avatar_static of this Account.  # noqa: E501
        :type avatar_static: str
        :param bot: The bot of this Account.  # noqa: E501
        :type bot: bool
        :param created_at: The created_at of this Account.  # noqa: E501
        :type created_at: datetime
        :param discoverable: The discoverable of this Account.  # noqa: E501
        :type discoverable: bool
        :param display_name: The display_name of this Account.  # noqa: E501
        :type display_name: str
        :param emojis: The emojis of this Account.  # noqa: E501
        :type emojis: List[Emoji]
        :param fields: The fields of this Account.  # noqa: E501
        :type fields: List[Field]
        :param followers_count: The followers_count of this Account.  # noqa: E501
        :type followers_count: int
        :param following_count: The following_count of this Account.  # noqa: E501
        :type following_count: int
        :param header: The header of this Account.  # noqa: E501
        :type header: str
        :param header_static: The header_static of this Account.  # noqa: E501
        :type header_static: str
        :param id: The id of this Account.  # noqa: E501
        :type id: str
        :param last_status_at: The last_status_at of this Account.  # noqa: E501
        :type last_status_at: datetime
        :param locked: The locked of this Account.  # noqa: E501
        :type locked: bool
        :param moved: The moved of this Account.  # noqa: E501
        :type moved: Account
        :param mute_expires_at: The mute_expires_at of this Account.  # noqa: E501
        :type mute_expires_at: datetime
        :param note: The note of this Account.  # noqa: E501
        :type note: str
        :param source: The source of this Account.  # noqa: E501
        :type source: Source
        :param statuses_count: The statuses_count of this Account.  # noqa: E501
        :type statuses_count: int
        :param suspended: The suspended of this Account.  # noqa: E501
        :type suspended: bool
        :param url: The url of this Account.  # noqa: E501
        :type url: str
        :param username: The username of this Account.  # noqa: E501
        :type username: str
        """
        self.openapi_types = {
            'acct': str,
            'avatar': str,
            'avatar_static': str,
            'bot': bool,
            'created_at': datetime,
            'discoverable': bool,
            'display_name': str,
            'emojis': List[Emoji],
            'fields': List[Field],
            'followers_count': int,
            'following_count': int,
            'header': str,
            'header_static': str,
            'id': str,
            'last_status_at': datetime,
            'locked': bool,
            'moved': Account,
            'mute_expires_at': datetime,
            'note': str,
            'source': Source,
            'statuses_count': int,
            'suspended': bool,
            'url': str,
            'username': str
        }

        self.attribute_map = {
            'acct': 'acct',
            'avatar': 'avatar',
            'avatar_static': 'avatar_static',
            'bot': 'bot',
            'created_at': 'created_at',
            'discoverable': 'discoverable',
            'display_name': 'display_name',
            'emojis': 'emojis',
            'fields': 'fields',
            'followers_count': 'followers_count',
            'following_count': 'following_count',
            'header': 'header',
            'header_static': 'header_static',
            'id': 'id',
            'last_status_at': 'last_status_at',
            'locked': 'locked',
            'moved': 'moved',
            'mute_expires_at': 'mute_expires_at',
            'note': 'note',
            'source': 'source',
            'statuses_count': 'statuses_count',
            'suspended': 'suspended',
            'url': 'url',
            'username': 'username'
        }

        self._acct = acct
        self._avatar = avatar
        self._avatar_static = avatar_static
        self._bot = bot
        self._created_at = created_at
        self._discoverable = discoverable
        self._display_name = display_name
        self._emojis = emojis
        self._fields = fields
        self._followers_count = followers_count
        self._following_count = following_count
        self._header = header
        self._header_static = header_static
        self._id = id
        self._last_status_at = last_status_at
        self._locked = locked
        self._moved = moved
        self._mute_expires_at = mute_expires_at
        self._note = note
        self._source = source
        self._statuses_count = statuses_count
        self._suspended = suspended
        self._url = url
        self._username = username

    @classmethod
    def from_dict(cls, dikt) -> 'Account':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Account of this Account.  # noqa: E501
        :rtype: Account
        """
        return util.deserialize_model(dikt, cls)

    @property
    def acct(self) -> str:
        """Gets the acct of this Account.

        The Webfinger account URI. Equal to `username` for local users, or `username@domain` for  # noqa: E501

        :return: The acct of this Account.
        :rtype: str
        """
        return self._acct

    @acct.setter
    def acct(self, acct: str):
        """Sets the acct of this Account.

        The Webfinger account URI. Equal to `username` for local users, or `username@domain` for  # noqa: E501

        :param acct: The acct of this Account.
        :type acct: str
        """

        self._acct = acct

    @property
    def avatar(self) -> str:
        """Gets the avatar of this Account.

        An image icon that is shown next to statuses and in the profile. The format is URL.  # noqa: E501

        :return: The avatar of this Account.
        :rtype: str
        """
        return self._avatar

    @avatar.setter
    def avatar(self, avatar: str):
        """Sets the avatar of this Account.

        An image icon that is shown next to statuses and in the profile. The format is URL.  # noqa: E501

        :param avatar: The avatar of this Account.
        :type avatar: str
        """

        self._avatar = avatar

    @property
    def avatar_static(self) -> str:
        """Gets the avatar_static of this Account.

        A static version of the avatar. Equal to `avatar` if its value is a static image; different if `avatar` is an animated GIF. The format is URL.  # noqa: E501

        :return: The avatar_static of this Account.
        :rtype: str
        """
        return self._avatar_static

    @avatar_static.setter
    def avatar_static(self, avatar_static: str):
        """Sets the avatar_static of this Account.

        A static version of the avatar. Equal to `avatar` if its value is a static image; different if `avatar` is an animated GIF. The format is URL.  # noqa: E501

        :param avatar_static: The avatar_static of this Account.
        :type avatar_static: str
        """

        self._avatar_static = avatar_static

    @property
    def bot(self) -> bool:
        """Gets the bot of this Account.

        A presentational flag. Indicates that the account may perform automated actions, may not be monitored, or identifies as a robot.  # noqa: E501

        :return: The bot of this Account.
        :rtype: bool
        """
        return self._bot

    @bot.setter
    def bot(self, bot: bool):
        """Sets the bot of this Account.

        A presentational flag. Indicates that the account may perform automated actions, may not be monitored, or identifies as a robot.  # noqa: E501

        :param bot: The bot of this Account.
        :type bot: bool
        """

        self._bot = bot

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this Account.

        When the account was created.  # noqa: E501

        :return: The created_at of this Account.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this Account.

        When the account was created.  # noqa: E501

        :param created_at: The created_at of this Account.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def discoverable(self) -> bool:
        """Gets the discoverable of this Account.

        Whether the account has opted into discovery features such as the profile directory.  # noqa: E501

        :return: The discoverable of this Account.
        :rtype: bool
        """
        return self._discoverable

    @discoverable.setter
    def discoverable(self, discoverable: bool):
        """Sets the discoverable of this Account.

        Whether the account has opted into discovery features such as the profile directory.  # noqa: E501

        :param discoverable: The discoverable of this Account.
        :type discoverable: bool
        """

        self._discoverable = discoverable

    @property
    def display_name(self) -> str:
        """Gets the display_name of this Account.

        The profile's display name.  # noqa: E501

        :return: The display_name of this Account.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name: str):
        """Sets the display_name of this Account.

        The profile's display name.  # noqa: E501

        :param display_name: The display_name of this Account.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def emojis(self) -> List[Emoji]:
        """Gets the emojis of this Account.

        Custom emoji entities to be used when rendering the profile. If none, an empty array will be returned.  # noqa: E501

        :return: The emojis of this Account.
        :rtype: List[Emoji]
        """
        return self._emojis

    @emojis.setter
    def emojis(self, emojis: List[Emoji]):
        """Sets the emojis of this Account.

        Custom emoji entities to be used when rendering the profile. If none, an empty array will be returned.  # noqa: E501

        :param emojis: The emojis of this Account.
        :type emojis: List[Emoji]
        """

        self._emojis = emojis

    @property
    def fields(self) -> List[Field]:
        """Gets the fields of this Account.

        Additional metadata attached to a profile as name-value pairs.  # noqa: E501

        :return: The fields of this Account.
        :rtype: List[Field]
        """
        return self._fields

    @fields.setter
    def fields(self, fields: List[Field]):
        """Sets the fields of this Account.

        Additional metadata attached to a profile as name-value pairs.  # noqa: E501

        :param fields: The fields of this Account.
        :type fields: List[Field]
        """

        self._fields = fields

    @property
    def followers_count(self) -> int:
        """Gets the followers_count of this Account.

        The reported followers of this profile.  # noqa: E501

        :return: The followers_count of this Account.
        :rtype: int
        """
        return self._followers_count

    @followers_count.setter
    def followers_count(self, followers_count: int):
        """Sets the followers_count of this Account.

        The reported followers of this profile.  # noqa: E501

        :param followers_count: The followers_count of this Account.
        :type followers_count: int
        """

        self._followers_count = followers_count

    @property
    def following_count(self) -> int:
        """Gets the following_count of this Account.

        The reported follows of this profile.  # noqa: E501

        :return: The following_count of this Account.
        :rtype: int
        """
        return self._following_count

    @following_count.setter
    def following_count(self, following_count: int):
        """Sets the following_count of this Account.

        The reported follows of this profile.  # noqa: E501

        :param following_count: The following_count of this Account.
        :type following_count: int
        """

        self._following_count = following_count

    @property
    def header(self) -> str:
        """Gets the header of this Account.

        An image banner that is shown above the profile and in profile cards. The format is URL.  # noqa: E501

        :return: The header of this Account.
        :rtype: str
        """
        return self._header

    @header.setter
    def header(self, header: str):
        """Sets the header of this Account.

        An image banner that is shown above the profile and in profile cards. The format is URL.  # noqa: E501

        :param header: The header of this Account.
        :type header: str
        """

        self._header = header

    @property
    def header_static(self) -> str:
        """Gets the header_static of this Account.

        A static version of the header. Equal to `header` if its value is a static image; different if `header` is an animated GIF. The format is URL.  # noqa: E501

        :return: The header_static of this Account.
        :rtype: str
        """
        return self._header_static

    @header_static.setter
    def header_static(self, header_static: str):
        """Sets the header_static of this Account.

        A static version of the header. Equal to `header` if its value is a static image; different if `header` is an animated GIF. The format is URL.  # noqa: E501

        :param header_static: The header_static of this Account.
        :type header_static: str
        """

        self._header_static = header_static

    @property
    def id(self) -> str:
        """Gets the id of this Account.

        The account id `header`.  # noqa: E501

        :return: The id of this Account.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Account.

        The account id `header`.  # noqa: E501

        :param id: The id of this Account.
        :type id: str
        """

        self._id = id

    @property
    def last_status_at(self) -> datetime:
        """Gets the last_status_at of this Account.

        When the most recent status was posted.  # noqa: E501

        :return: The last_status_at of this Account.
        :rtype: datetime
        """
        return self._last_status_at

    @last_status_at.setter
    def last_status_at(self, last_status_at: datetime):
        """Sets the last_status_at of this Account.

        When the most recent status was posted.  # noqa: E501

        :param last_status_at: The last_status_at of this Account.
        :type last_status_at: datetime
        """

        self._last_status_at = last_status_at

    @property
    def locked(self) -> bool:
        """Gets the locked of this Account.

        Whether the account manually approves follow requests.  # noqa: E501

        :return: The locked of this Account.
        :rtype: bool
        """
        return self._locked

    @locked.setter
    def locked(self, locked: bool):
        """Sets the locked of this Account.

        Whether the account manually approves follow requests.  # noqa: E501

        :param locked: The locked of this Account.
        :type locked: bool
        """

        self._locked = locked

    @property
    def moved(self) -> Account:
        """Gets the moved of this Account.


        :return: The moved of this Account.
        :rtype: Account
        """
        return self._moved

    @moved.setter
    def moved(self, moved: Account):
        """Sets the moved of this Account.


        :param moved: The moved of this Account.
        :type moved: Account
        """

        self._moved = moved

    @property
    def mute_expires_at(self) -> datetime:
        """Gets the mute_expires_at of this Account.

        When a timed mute will expire, if applicable. ISO 8601 Datetime.  # noqa: E501

        :return: The mute_expires_at of this Account.
        :rtype: datetime
        """
        return self._mute_expires_at

    @mute_expires_at.setter
    def mute_expires_at(self, mute_expires_at: datetime):
        """Sets the mute_expires_at of this Account.

        When a timed mute will expire, if applicable. ISO 8601 Datetime.  # noqa: E501

        :param mute_expires_at: The mute_expires_at of this Account.
        :type mute_expires_at: datetime
        """

        self._mute_expires_at = mute_expires_at

    @property
    def note(self) -> str:
        """Gets the note of this Account.

        The profile's bio / description.  # noqa: E501

        :return: The note of this Account.
        :rtype: str
        """
        return self._note

    @note.setter
    def note(self, note: str):
        """Sets the note of this Account.

        The profile's bio / description.  # noqa: E501

        :param note: The note of this Account.
        :type note: str
        """

        self._note = note

    @property
    def source(self) -> Source:
        """Gets the source of this Account.


        :return: The source of this Account.
        :rtype: Source
        """
        return self._source

    @source.setter
    def source(self, source: Source):
        """Sets the source of this Account.


        :param source: The source of this Account.
        :type source: Source
        """

        self._source = source

    @property
    def statuses_count(self) -> int:
        """Gets the statuses_count of this Account.

        How many statuses are attached to this account.  # noqa: E501

        :return: The statuses_count of this Account.
        :rtype: int
        """
        return self._statuses_count

    @statuses_count.setter
    def statuses_count(self, statuses_count: int):
        """Sets the statuses_count of this Account.

        How many statuses are attached to this account.  # noqa: E501

        :param statuses_count: The statuses_count of this Account.
        :type statuses_count: int
        """

        self._statuses_count = statuses_count

    @property
    def suspended(self) -> bool:
        """Gets the suspended of this Account.

        An extra entity returned when an account is suspended.  # noqa: E501

        :return: The suspended of this Account.
        :rtype: bool
        """
        return self._suspended

    @suspended.setter
    def suspended(self, suspended: bool):
        """Sets the suspended of this Account.

        An extra entity returned when an account is suspended.  # noqa: E501

        :param suspended: The suspended of this Account.
        :type suspended: bool
        """

        self._suspended = suspended

    @property
    def url(self) -> str:
        """Gets the url of this Account.

        The location of the user's profile page. (HTTPS URL)  # noqa: E501

        :return: The url of this Account.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this Account.

        The location of the user's profile page. (HTTPS URL)  # noqa: E501

        :param url: The url of this Account.
        :type url: str
        """

        self._url = url

    @property
    def username(self) -> str:
        """Gets the username of this Account.

        The username of the account, not including domain.  # noqa: E501

        :return: The username of this Account.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username: str):
        """Sets the username of this Account.

        The username of the account, not including domain.  # noqa: E501

        :param username: The username of this Account.
        :type username: str
        """

        self._username = username
