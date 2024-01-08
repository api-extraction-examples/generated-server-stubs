from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.attachment_archive_entry import AttachmentArchiveEntry
from openapi_server import util

from openapi_server.models.attachment_archive_entry import AttachmentArchiveEntry  # noqa: E501

class AttachmentArchive(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, entries=None, more_available=None, total_entry_count=None, total_number_of_entries_available=None):  # noqa: E501
        """AttachmentArchive - a model defined in OpenAPI

        :param entries: The entries of this AttachmentArchive.  # noqa: E501
        :type entries: List[AttachmentArchiveEntry]
        :param more_available: The more_available of this AttachmentArchive.  # noqa: E501
        :type more_available: bool
        :param total_entry_count: The total_entry_count of this AttachmentArchive.  # noqa: E501
        :type total_entry_count: int
        :param total_number_of_entries_available: The total_number_of_entries_available of this AttachmentArchive.  # noqa: E501
        :type total_number_of_entries_available: int
        """
        self.openapi_types = {
            'entries': List[AttachmentArchiveEntry],
            'more_available': bool,
            'total_entry_count': int,
            'total_number_of_entries_available': int
        }

        self.attribute_map = {
            'entries': 'entries',
            'more_available': 'moreAvailable',
            'total_entry_count': 'totalEntryCount',
            'total_number_of_entries_available': 'totalNumberOfEntriesAvailable'
        }

        self._entries = entries
        self._more_available = more_available
        self._total_entry_count = total_entry_count
        self._total_number_of_entries_available = total_number_of_entries_available

    @classmethod
    def from_dict(cls, dikt) -> 'AttachmentArchive':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AttachmentArchive of this AttachmentArchive.  # noqa: E501
        :rtype: AttachmentArchive
        """
        return util.deserialize_model(dikt, cls)

    @property
    def entries(self) -> List[AttachmentArchiveEntry]:
        """Gets the entries of this AttachmentArchive.


        :return: The entries of this AttachmentArchive.
        :rtype: List[AttachmentArchiveEntry]
        """
        return self._entries

    @entries.setter
    def entries(self, entries: List[AttachmentArchiveEntry]):
        """Sets the entries of this AttachmentArchive.


        :param entries: The entries of this AttachmentArchive.
        :type entries: List[AttachmentArchiveEntry]
        """

        self._entries = entries

    @property
    def more_available(self) -> bool:
        """Gets the more_available of this AttachmentArchive.


        :return: The more_available of this AttachmentArchive.
        :rtype: bool
        """
        return self._more_available

    @more_available.setter
    def more_available(self, more_available: bool):
        """Sets the more_available of this AttachmentArchive.


        :param more_available: The more_available of this AttachmentArchive.
        :type more_available: bool
        """

        self._more_available = more_available

    @property
    def total_entry_count(self) -> int:
        """Gets the total_entry_count of this AttachmentArchive.


        :return: The total_entry_count of this AttachmentArchive.
        :rtype: int
        """
        return self._total_entry_count

    @total_entry_count.setter
    def total_entry_count(self, total_entry_count: int):
        """Sets the total_entry_count of this AttachmentArchive.


        :param total_entry_count: The total_entry_count of this AttachmentArchive.
        :type total_entry_count: int
        """

        self._total_entry_count = total_entry_count

    @property
    def total_number_of_entries_available(self) -> int:
        """Gets the total_number_of_entries_available of this AttachmentArchive.


        :return: The total_number_of_entries_available of this AttachmentArchive.
        :rtype: int
        """
        return self._total_number_of_entries_available

    @total_number_of_entries_available.setter
    def total_number_of_entries_available(self, total_number_of_entries_available: int):
        """Sets the total_number_of_entries_available of this AttachmentArchive.


        :param total_number_of_entries_available: The total_number_of_entries_available of this AttachmentArchive.
        :type total_number_of_entries_available: int
        """

        self._total_number_of_entries_available = total_number_of_entries_available
