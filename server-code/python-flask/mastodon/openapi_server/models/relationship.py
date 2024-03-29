from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Relationship(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, blocked_by=None, blocking=None, domain_blocking=None, endorsed=None, followed_by=None, following=None, id=None, muting=None, muting_notifications=None, note=None, notifying=None, requested=None, showing_reblogs=None):  # noqa: E501
        """Relationship - a model defined in OpenAPI

        :param blocked_by: The blocked_by of this Relationship.  # noqa: E501
        :type blocked_by: bool
        :param blocking: The blocking of this Relationship.  # noqa: E501
        :type blocking: bool
        :param domain_blocking: The domain_blocking of this Relationship.  # noqa: E501
        :type domain_blocking: bool
        :param endorsed: The endorsed of this Relationship.  # noqa: E501
        :type endorsed: bool
        :param followed_by: The followed_by of this Relationship.  # noqa: E501
        :type followed_by: bool
        :param following: The following of this Relationship.  # noqa: E501
        :type following: bool
        :param id: The id of this Relationship.  # noqa: E501
        :type id: str
        :param muting: The muting of this Relationship.  # noqa: E501
        :type muting: bool
        :param muting_notifications: The muting_notifications of this Relationship.  # noqa: E501
        :type muting_notifications: bool
        :param note: The note of this Relationship.  # noqa: E501
        :type note: str
        :param notifying: The notifying of this Relationship.  # noqa: E501
        :type notifying: bool
        :param requested: The requested of this Relationship.  # noqa: E501
        :type requested: bool
        :param showing_reblogs: The showing_reblogs of this Relationship.  # noqa: E501
        :type showing_reblogs: bool
        """
        self.openapi_types = {
            'blocked_by': bool,
            'blocking': bool,
            'domain_blocking': bool,
            'endorsed': bool,
            'followed_by': bool,
            'following': bool,
            'id': str,
            'muting': bool,
            'muting_notifications': bool,
            'note': str,
            'notifying': bool,
            'requested': bool,
            'showing_reblogs': bool
        }

        self.attribute_map = {
            'blocked_by': 'blocked_by',
            'blocking': 'blocking',
            'domain_blocking': 'domain_blocking',
            'endorsed': 'endorsed',
            'followed_by': 'followed_by',
            'following': 'following',
            'id': 'id',
            'muting': 'muting',
            'muting_notifications': 'muting_notifications',
            'note': 'note',
            'notifying': 'notifying',
            'requested': 'requested',
            'showing_reblogs': 'showing_reblogs'
        }

        self._blocked_by = blocked_by
        self._blocking = blocking
        self._domain_blocking = domain_blocking
        self._endorsed = endorsed
        self._followed_by = followed_by
        self._following = following
        self._id = id
        self._muting = muting
        self._muting_notifications = muting_notifications
        self._note = note
        self._notifying = notifying
        self._requested = requested
        self._showing_reblogs = showing_reblogs

    @classmethod
    def from_dict(cls, dikt) -> 'Relationship':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Relationship of this Relationship.  # noqa: E501
        :rtype: Relationship
        """
        return util.deserialize_model(dikt, cls)

    @property
    def blocked_by(self) -> bool:
        """Gets the blocked_by of this Relationship.

        Is this user blocking you?  # noqa: E501

        :return: The blocked_by of this Relationship.
        :rtype: bool
        """
        return self._blocked_by

    @blocked_by.setter
    def blocked_by(self, blocked_by: bool):
        """Sets the blocked_by of this Relationship.

        Is this user blocking you?  # noqa: E501

        :param blocked_by: The blocked_by of this Relationship.
        :type blocked_by: bool
        """
        if blocked_by is None:
            raise ValueError("Invalid value for `blocked_by`, must not be `None`")  # noqa: E501

        self._blocked_by = blocked_by

    @property
    def blocking(self) -> bool:
        """Gets the blocking of this Relationship.

        Are you blocking this user?  # noqa: E501

        :return: The blocking of this Relationship.
        :rtype: bool
        """
        return self._blocking

    @blocking.setter
    def blocking(self, blocking: bool):
        """Sets the blocking of this Relationship.

        Are you blocking this user?  # noqa: E501

        :param blocking: The blocking of this Relationship.
        :type blocking: bool
        """
        if blocking is None:
            raise ValueError("Invalid value for `blocking`, must not be `None`")  # noqa: E501

        self._blocking = blocking

    @property
    def domain_blocking(self) -> bool:
        """Gets the domain_blocking of this Relationship.

        Are you blocking this user's domain?  # noqa: E501

        :return: The domain_blocking of this Relationship.
        :rtype: bool
        """
        return self._domain_blocking

    @domain_blocking.setter
    def domain_blocking(self, domain_blocking: bool):
        """Sets the domain_blocking of this Relationship.

        Are you blocking this user's domain?  # noqa: E501

        :param domain_blocking: The domain_blocking of this Relationship.
        :type domain_blocking: bool
        """
        if domain_blocking is None:
            raise ValueError("Invalid value for `domain_blocking`, must not be `None`")  # noqa: E501

        self._domain_blocking = domain_blocking

    @property
    def endorsed(self) -> bool:
        """Gets the endorsed of this Relationship.

        Are you featuring this user on your profile?  # noqa: E501

        :return: The endorsed of this Relationship.
        :rtype: bool
        """
        return self._endorsed

    @endorsed.setter
    def endorsed(self, endorsed: bool):
        """Sets the endorsed of this Relationship.

        Are you featuring this user on your profile?  # noqa: E501

        :param endorsed: The endorsed of this Relationship.
        :type endorsed: bool
        """
        if endorsed is None:
            raise ValueError("Invalid value for `endorsed`, must not be `None`")  # noqa: E501

        self._endorsed = endorsed

    @property
    def followed_by(self) -> bool:
        """Gets the followed_by of this Relationship.

        Are you followed by this user?  # noqa: E501

        :return: The followed_by of this Relationship.
        :rtype: bool
        """
        return self._followed_by

    @followed_by.setter
    def followed_by(self, followed_by: bool):
        """Sets the followed_by of this Relationship.

        Are you followed by this user?  # noqa: E501

        :param followed_by: The followed_by of this Relationship.
        :type followed_by: bool
        """
        if followed_by is None:
            raise ValueError("Invalid value for `followed_by`, must not be `None`")  # noqa: E501

        self._followed_by = followed_by

    @property
    def following(self) -> bool:
        """Gets the following of this Relationship.

        Are you following this user?  # noqa: E501

        :return: The following of this Relationship.
        :rtype: bool
        """
        return self._following

    @following.setter
    def following(self, following: bool):
        """Sets the following of this Relationship.

        Are you following this user?  # noqa: E501

        :param following: The following of this Relationship.
        :type following: bool
        """
        if following is None:
            raise ValueError("Invalid value for `following`, must not be `None`")  # noqa: E501

        self._following = following

    @property
    def id(self) -> str:
        """Gets the id of this Relationship.

        The account id. Cast from an integer, but not guaranteed to be a number.  # noqa: E501

        :return: The id of this Relationship.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Relationship.

        The account id. Cast from an integer, but not guaranteed to be a number.  # noqa: E501

        :param id: The id of this Relationship.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def muting(self) -> bool:
        """Gets the muting of this Relationship.

        Are you muting this user?  # noqa: E501

        :return: The muting of this Relationship.
        :rtype: bool
        """
        return self._muting

    @muting.setter
    def muting(self, muting: bool):
        """Sets the muting of this Relationship.

        Are you muting this user?  # noqa: E501

        :param muting: The muting of this Relationship.
        :type muting: bool
        """
        if muting is None:
            raise ValueError("Invalid value for `muting`, must not be `None`")  # noqa: E501

        self._muting = muting

    @property
    def muting_notifications(self) -> bool:
        """Gets the muting_notifications of this Relationship.

        Are you muting notifications from this user?  # noqa: E501

        :return: The muting_notifications of this Relationship.
        :rtype: bool
        """
        return self._muting_notifications

    @muting_notifications.setter
    def muting_notifications(self, muting_notifications: bool):
        """Sets the muting_notifications of this Relationship.

        Are you muting notifications from this user?  # noqa: E501

        :param muting_notifications: The muting_notifications of this Relationship.
        :type muting_notifications: bool
        """
        if muting_notifications is None:
            raise ValueError("Invalid value for `muting_notifications`, must not be `None`")  # noqa: E501

        self._muting_notifications = muting_notifications

    @property
    def note(self) -> str:
        """Gets the note of this Relationship.

        This user's profile bio  # noqa: E501

        :return: The note of this Relationship.
        :rtype: str
        """
        return self._note

    @note.setter
    def note(self, note: str):
        """Sets the note of this Relationship.

        This user's profile bio  # noqa: E501

        :param note: The note of this Relationship.
        :type note: str
        """
        if note is None:
            raise ValueError("Invalid value for `note`, must not be `None`")  # noqa: E501

        self._note = note

    @property
    def notifying(self) -> bool:
        """Gets the notifying of this Relationship.

        Have you enabled notifications for this user?  # noqa: E501

        :return: The notifying of this Relationship.
        :rtype: bool
        """
        return self._notifying

    @notifying.setter
    def notifying(self, notifying: bool):
        """Sets the notifying of this Relationship.

        Have you enabled notifications for this user?  # noqa: E501

        :param notifying: The notifying of this Relationship.
        :type notifying: bool
        """
        if notifying is None:
            raise ValueError("Invalid value for `notifying`, must not be `None`")  # noqa: E501

        self._notifying = notifying

    @property
    def requested(self) -> bool:
        """Gets the requested of this Relationship.

        Do you have a pending follow request for this user?  # noqa: E501

        :return: The requested of this Relationship.
        :rtype: bool
        """
        return self._requested

    @requested.setter
    def requested(self, requested: bool):
        """Sets the requested of this Relationship.

        Do you have a pending follow request for this user?  # noqa: E501

        :param requested: The requested of this Relationship.
        :type requested: bool
        """
        if requested is None:
            raise ValueError("Invalid value for `requested`, must not be `None`")  # noqa: E501

        self._requested = requested

    @property
    def showing_reblogs(self) -> bool:
        """Gets the showing_reblogs of this Relationship.

        Are you receiving this user's boosts in your home timeline?  # noqa: E501

        :return: The showing_reblogs of this Relationship.
        :rtype: bool
        """
        return self._showing_reblogs

    @showing_reblogs.setter
    def showing_reblogs(self, showing_reblogs: bool):
        """Sets the showing_reblogs of this Relationship.

        Are you receiving this user's boosts in your home timeline?  # noqa: E501

        :param showing_reblogs: The showing_reblogs of this Relationship.
        :type showing_reblogs: bool
        """
        if showing_reblogs is None:
            raise ValueError("Invalid value for `showing_reblogs`, must not be `None`")  # noqa: E501

        self._showing_reblogs = showing_reblogs
