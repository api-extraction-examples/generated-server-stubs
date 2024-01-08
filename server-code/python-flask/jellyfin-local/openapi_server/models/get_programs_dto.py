from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.image_type import ImageType
from openapi_server.models.item_fields import ItemFields
from openapi_server import util

from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501

class GetProgramsDto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, channel_ids=None, enable_image_types=None, enable_images=None, enable_total_record_count=None, enable_user_data=None, fields=None, genre_ids=None, genres=None, has_aired=None, image_type_limit=None, is_airing=None, is_kids=None, is_movie=None, is_news=None, is_series=None, is_sports=None, library_series_id=None, limit=None, max_end_date=None, max_start_date=None, min_end_date=None, min_start_date=None, series_timer_id=None, sort_by=None, sort_order=None, start_index=None, user_id=None):  # noqa: E501
        """GetProgramsDto - a model defined in OpenAPI

        :param channel_ids: The channel_ids of this GetProgramsDto.  # noqa: E501
        :type channel_ids: List[str]
        :param enable_image_types: The enable_image_types of this GetProgramsDto.  # noqa: E501
        :type enable_image_types: List[ImageType]
        :param enable_images: The enable_images of this GetProgramsDto.  # noqa: E501
        :type enable_images: bool
        :param enable_total_record_count: The enable_total_record_count of this GetProgramsDto.  # noqa: E501
        :type enable_total_record_count: bool
        :param enable_user_data: The enable_user_data of this GetProgramsDto.  # noqa: E501
        :type enable_user_data: bool
        :param fields: The fields of this GetProgramsDto.  # noqa: E501
        :type fields: List[ItemFields]
        :param genre_ids: The genre_ids of this GetProgramsDto.  # noqa: E501
        :type genre_ids: List[str]
        :param genres: The genres of this GetProgramsDto.  # noqa: E501
        :type genres: List[str]
        :param has_aired: The has_aired of this GetProgramsDto.  # noqa: E501
        :type has_aired: bool
        :param image_type_limit: The image_type_limit of this GetProgramsDto.  # noqa: E501
        :type image_type_limit: int
        :param is_airing: The is_airing of this GetProgramsDto.  # noqa: E501
        :type is_airing: bool
        :param is_kids: The is_kids of this GetProgramsDto.  # noqa: E501
        :type is_kids: bool
        :param is_movie: The is_movie of this GetProgramsDto.  # noqa: E501
        :type is_movie: bool
        :param is_news: The is_news of this GetProgramsDto.  # noqa: E501
        :type is_news: bool
        :param is_series: The is_series of this GetProgramsDto.  # noqa: E501
        :type is_series: bool
        :param is_sports: The is_sports of this GetProgramsDto.  # noqa: E501
        :type is_sports: bool
        :param library_series_id: The library_series_id of this GetProgramsDto.  # noqa: E501
        :type library_series_id: str
        :param limit: The limit of this GetProgramsDto.  # noqa: E501
        :type limit: int
        :param max_end_date: The max_end_date of this GetProgramsDto.  # noqa: E501
        :type max_end_date: datetime
        :param max_start_date: The max_start_date of this GetProgramsDto.  # noqa: E501
        :type max_start_date: datetime
        :param min_end_date: The min_end_date of this GetProgramsDto.  # noqa: E501
        :type min_end_date: datetime
        :param min_start_date: The min_start_date of this GetProgramsDto.  # noqa: E501
        :type min_start_date: datetime
        :param series_timer_id: The series_timer_id of this GetProgramsDto.  # noqa: E501
        :type series_timer_id: str
        :param sort_by: The sort_by of this GetProgramsDto.  # noqa: E501
        :type sort_by: str
        :param sort_order: The sort_order of this GetProgramsDto.  # noqa: E501
        :type sort_order: str
        :param start_index: The start_index of this GetProgramsDto.  # noqa: E501
        :type start_index: int
        :param user_id: The user_id of this GetProgramsDto.  # noqa: E501
        :type user_id: str
        """
        self.openapi_types = {
            'channel_ids': List[str],
            'enable_image_types': List[ImageType],
            'enable_images': bool,
            'enable_total_record_count': bool,
            'enable_user_data': bool,
            'fields': List[ItemFields],
            'genre_ids': List[str],
            'genres': List[str],
            'has_aired': bool,
            'image_type_limit': int,
            'is_airing': bool,
            'is_kids': bool,
            'is_movie': bool,
            'is_news': bool,
            'is_series': bool,
            'is_sports': bool,
            'library_series_id': str,
            'limit': int,
            'max_end_date': datetime,
            'max_start_date': datetime,
            'min_end_date': datetime,
            'min_start_date': datetime,
            'series_timer_id': str,
            'sort_by': str,
            'sort_order': str,
            'start_index': int,
            'user_id': str
        }

        self.attribute_map = {
            'channel_ids': 'ChannelIds',
            'enable_image_types': 'EnableImageTypes',
            'enable_images': 'EnableImages',
            'enable_total_record_count': 'EnableTotalRecordCount',
            'enable_user_data': 'EnableUserData',
            'fields': 'Fields',
            'genre_ids': 'GenreIds',
            'genres': 'Genres',
            'has_aired': 'HasAired',
            'image_type_limit': 'ImageTypeLimit',
            'is_airing': 'IsAiring',
            'is_kids': 'IsKids',
            'is_movie': 'IsMovie',
            'is_news': 'IsNews',
            'is_series': 'IsSeries',
            'is_sports': 'IsSports',
            'library_series_id': 'LibrarySeriesId',
            'limit': 'Limit',
            'max_end_date': 'MaxEndDate',
            'max_start_date': 'MaxStartDate',
            'min_end_date': 'MinEndDate',
            'min_start_date': 'MinStartDate',
            'series_timer_id': 'SeriesTimerId',
            'sort_by': 'SortBy',
            'sort_order': 'SortOrder',
            'start_index': 'StartIndex',
            'user_id': 'UserId'
        }

        self._channel_ids = channel_ids
        self._enable_image_types = enable_image_types
        self._enable_images = enable_images
        self._enable_total_record_count = enable_total_record_count
        self._enable_user_data = enable_user_data
        self._fields = fields
        self._genre_ids = genre_ids
        self._genres = genres
        self._has_aired = has_aired
        self._image_type_limit = image_type_limit
        self._is_airing = is_airing
        self._is_kids = is_kids
        self._is_movie = is_movie
        self._is_news = is_news
        self._is_series = is_series
        self._is_sports = is_sports
        self._library_series_id = library_series_id
        self._limit = limit
        self._max_end_date = max_end_date
        self._max_start_date = max_start_date
        self._min_end_date = min_end_date
        self._min_start_date = min_start_date
        self._series_timer_id = series_timer_id
        self._sort_by = sort_by
        self._sort_order = sort_order
        self._start_index = start_index
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'GetProgramsDto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetProgramsDto of this GetProgramsDto.  # noqa: E501
        :rtype: GetProgramsDto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def channel_ids(self) -> List[str]:
        """Gets the channel_ids of this GetProgramsDto.

        Gets or sets the channels to return guide information for.  # noqa: E501

        :return: The channel_ids of this GetProgramsDto.
        :rtype: List[str]
        """
        return self._channel_ids

    @channel_ids.setter
    def channel_ids(self, channel_ids: List[str]):
        """Sets the channel_ids of this GetProgramsDto.

        Gets or sets the channels to return guide information for.  # noqa: E501

        :param channel_ids: The channel_ids of this GetProgramsDto.
        :type channel_ids: List[str]
        """

        self._channel_ids = channel_ids

    @property
    def enable_image_types(self) -> List[ImageType]:
        """Gets the enable_image_types of this GetProgramsDto.

        Gets or sets the image types to include in the output.  Optional.  # noqa: E501

        :return: The enable_image_types of this GetProgramsDto.
        :rtype: List[ImageType]
        """
        return self._enable_image_types

    @enable_image_types.setter
    def enable_image_types(self, enable_image_types: List[ImageType]):
        """Sets the enable_image_types of this GetProgramsDto.

        Gets or sets the image types to include in the output.  Optional.  # noqa: E501

        :param enable_image_types: The enable_image_types of this GetProgramsDto.
        :type enable_image_types: List[ImageType]
        """

        self._enable_image_types = enable_image_types

    @property
    def enable_images(self) -> bool:
        """Gets the enable_images of this GetProgramsDto.

        Gets or sets include image information in output.  Optional.  # noqa: E501

        :return: The enable_images of this GetProgramsDto.
        :rtype: bool
        """
        return self._enable_images

    @enable_images.setter
    def enable_images(self, enable_images: bool):
        """Sets the enable_images of this GetProgramsDto.

        Gets or sets include image information in output.  Optional.  # noqa: E501

        :param enable_images: The enable_images of this GetProgramsDto.
        :type enable_images: bool
        """

        self._enable_images = enable_images

    @property
    def enable_total_record_count(self) -> bool:
        """Gets the enable_total_record_count of this GetProgramsDto.

        Gets or sets a value indicating whether retrieve total record count.  # noqa: E501

        :return: The enable_total_record_count of this GetProgramsDto.
        :rtype: bool
        """
        return self._enable_total_record_count

    @enable_total_record_count.setter
    def enable_total_record_count(self, enable_total_record_count: bool):
        """Sets the enable_total_record_count of this GetProgramsDto.

        Gets or sets a value indicating whether retrieve total record count.  # noqa: E501

        :param enable_total_record_count: The enable_total_record_count of this GetProgramsDto.
        :type enable_total_record_count: bool
        """

        self._enable_total_record_count = enable_total_record_count

    @property
    def enable_user_data(self) -> bool:
        """Gets the enable_user_data of this GetProgramsDto.

        Gets or sets include user data.  Optional.  # noqa: E501

        :return: The enable_user_data of this GetProgramsDto.
        :rtype: bool
        """
        return self._enable_user_data

    @enable_user_data.setter
    def enable_user_data(self, enable_user_data: bool):
        """Sets the enable_user_data of this GetProgramsDto.

        Gets or sets include user data.  Optional.  # noqa: E501

        :param enable_user_data: The enable_user_data of this GetProgramsDto.
        :type enable_user_data: bool
        """

        self._enable_user_data = enable_user_data

    @property
    def fields(self) -> List[ItemFields]:
        """Gets the fields of this GetProgramsDto.

        Gets or sets specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines.  Optional.  # noqa: E501

        :return: The fields of this GetProgramsDto.
        :rtype: List[ItemFields]
        """
        return self._fields

    @fields.setter
    def fields(self, fields: List[ItemFields]):
        """Sets the fields of this GetProgramsDto.

        Gets or sets specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines.  Optional.  # noqa: E501

        :param fields: The fields of this GetProgramsDto.
        :type fields: List[ItemFields]
        """

        self._fields = fields

    @property
    def genre_ids(self) -> List[str]:
        """Gets the genre_ids of this GetProgramsDto.

        Gets or sets the genre ids to return guide information for.  # noqa: E501

        :return: The genre_ids of this GetProgramsDto.
        :rtype: List[str]
        """
        return self._genre_ids

    @genre_ids.setter
    def genre_ids(self, genre_ids: List[str]):
        """Sets the genre_ids of this GetProgramsDto.

        Gets or sets the genre ids to return guide information for.  # noqa: E501

        :param genre_ids: The genre_ids of this GetProgramsDto.
        :type genre_ids: List[str]
        """

        self._genre_ids = genre_ids

    @property
    def genres(self) -> List[str]:
        """Gets the genres of this GetProgramsDto.

        Gets or sets the genres to return guide information for.  # noqa: E501

        :return: The genres of this GetProgramsDto.
        :rtype: List[str]
        """
        return self._genres

    @genres.setter
    def genres(self, genres: List[str]):
        """Sets the genres of this GetProgramsDto.

        Gets or sets the genres to return guide information for.  # noqa: E501

        :param genres: The genres of this GetProgramsDto.
        :type genres: List[str]
        """

        self._genres = genres

    @property
    def has_aired(self) -> bool:
        """Gets the has_aired of this GetProgramsDto.

        Gets or sets filter by programs that have completed airing, or not.  Optional.  # noqa: E501

        :return: The has_aired of this GetProgramsDto.
        :rtype: bool
        """
        return self._has_aired

    @has_aired.setter
    def has_aired(self, has_aired: bool):
        """Sets the has_aired of this GetProgramsDto.

        Gets or sets filter by programs that have completed airing, or not.  Optional.  # noqa: E501

        :param has_aired: The has_aired of this GetProgramsDto.
        :type has_aired: bool
        """

        self._has_aired = has_aired

    @property
    def image_type_limit(self) -> int:
        """Gets the image_type_limit of this GetProgramsDto.

        Gets or sets the max number of images to return, per image type.  Optional.  # noqa: E501

        :return: The image_type_limit of this GetProgramsDto.
        :rtype: int
        """
        return self._image_type_limit

    @image_type_limit.setter
    def image_type_limit(self, image_type_limit: int):
        """Sets the image_type_limit of this GetProgramsDto.

        Gets or sets the max number of images to return, per image type.  Optional.  # noqa: E501

        :param image_type_limit: The image_type_limit of this GetProgramsDto.
        :type image_type_limit: int
        """

        self._image_type_limit = image_type_limit

    @property
    def is_airing(self) -> bool:
        """Gets the is_airing of this GetProgramsDto.

        Gets or sets filter by programs that are currently airing, or not.  Optional.  # noqa: E501

        :return: The is_airing of this GetProgramsDto.
        :rtype: bool
        """
        return self._is_airing

    @is_airing.setter
    def is_airing(self, is_airing: bool):
        """Sets the is_airing of this GetProgramsDto.

        Gets or sets filter by programs that are currently airing, or not.  Optional.  # noqa: E501

        :param is_airing: The is_airing of this GetProgramsDto.
        :type is_airing: bool
        """

        self._is_airing = is_airing

    @property
    def is_kids(self) -> bool:
        """Gets the is_kids of this GetProgramsDto.

        Gets or sets filter for kids.  Optional.  # noqa: E501

        :return: The is_kids of this GetProgramsDto.
        :rtype: bool
        """
        return self._is_kids

    @is_kids.setter
    def is_kids(self, is_kids: bool):
        """Sets the is_kids of this GetProgramsDto.

        Gets or sets filter for kids.  Optional.  # noqa: E501

        :param is_kids: The is_kids of this GetProgramsDto.
        :type is_kids: bool
        """

        self._is_kids = is_kids

    @property
    def is_movie(self) -> bool:
        """Gets the is_movie of this GetProgramsDto.

        Gets or sets filter for movies.  Optional.  # noqa: E501

        :return: The is_movie of this GetProgramsDto.
        :rtype: bool
        """
        return self._is_movie

    @is_movie.setter
    def is_movie(self, is_movie: bool):
        """Sets the is_movie of this GetProgramsDto.

        Gets or sets filter for movies.  Optional.  # noqa: E501

        :param is_movie: The is_movie of this GetProgramsDto.
        :type is_movie: bool
        """

        self._is_movie = is_movie

    @property
    def is_news(self) -> bool:
        """Gets the is_news of this GetProgramsDto.

        Gets or sets filter for news.  Optional.  # noqa: E501

        :return: The is_news of this GetProgramsDto.
        :rtype: bool
        """
        return self._is_news

    @is_news.setter
    def is_news(self, is_news: bool):
        """Sets the is_news of this GetProgramsDto.

        Gets or sets filter for news.  Optional.  # noqa: E501

        :param is_news: The is_news of this GetProgramsDto.
        :type is_news: bool
        """

        self._is_news = is_news

    @property
    def is_series(self) -> bool:
        """Gets the is_series of this GetProgramsDto.

        Gets or sets filter for series.  Optional.  # noqa: E501

        :return: The is_series of this GetProgramsDto.
        :rtype: bool
        """
        return self._is_series

    @is_series.setter
    def is_series(self, is_series: bool):
        """Sets the is_series of this GetProgramsDto.

        Gets or sets filter for series.  Optional.  # noqa: E501

        :param is_series: The is_series of this GetProgramsDto.
        :type is_series: bool
        """

        self._is_series = is_series

    @property
    def is_sports(self) -> bool:
        """Gets the is_sports of this GetProgramsDto.

        Gets or sets filter for sports.  Optional.  # noqa: E501

        :return: The is_sports of this GetProgramsDto.
        :rtype: bool
        """
        return self._is_sports

    @is_sports.setter
    def is_sports(self, is_sports: bool):
        """Sets the is_sports of this GetProgramsDto.

        Gets or sets filter for sports.  Optional.  # noqa: E501

        :param is_sports: The is_sports of this GetProgramsDto.
        :type is_sports: bool
        """

        self._is_sports = is_sports

    @property
    def library_series_id(self) -> str:
        """Gets the library_series_id of this GetProgramsDto.

        Gets or sets filter by library series id.  Optional.  # noqa: E501

        :return: The library_series_id of this GetProgramsDto.
        :rtype: str
        """
        return self._library_series_id

    @library_series_id.setter
    def library_series_id(self, library_series_id: str):
        """Sets the library_series_id of this GetProgramsDto.

        Gets or sets filter by library series id.  Optional.  # noqa: E501

        :param library_series_id: The library_series_id of this GetProgramsDto.
        :type library_series_id: str
        """

        self._library_series_id = library_series_id

    @property
    def limit(self) -> int:
        """Gets the limit of this GetProgramsDto.

        Gets or sets the maximum number of records to return.  Optional.  # noqa: E501

        :return: The limit of this GetProgramsDto.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit: int):
        """Sets the limit of this GetProgramsDto.

        Gets or sets the maximum number of records to return.  Optional.  # noqa: E501

        :param limit: The limit of this GetProgramsDto.
        :type limit: int
        """

        self._limit = limit

    @property
    def max_end_date(self) -> datetime:
        """Gets the max_end_date of this GetProgramsDto.

        Gets or sets the maximum premiere end date.  Optional.  # noqa: E501

        :return: The max_end_date of this GetProgramsDto.
        :rtype: datetime
        """
        return self._max_end_date

    @max_end_date.setter
    def max_end_date(self, max_end_date: datetime):
        """Sets the max_end_date of this GetProgramsDto.

        Gets or sets the maximum premiere end date.  Optional.  # noqa: E501

        :param max_end_date: The max_end_date of this GetProgramsDto.
        :type max_end_date: datetime
        """

        self._max_end_date = max_end_date

    @property
    def max_start_date(self) -> datetime:
        """Gets the max_start_date of this GetProgramsDto.

        Gets or sets the maximum premiere start date.  Optional.  # noqa: E501

        :return: The max_start_date of this GetProgramsDto.
        :rtype: datetime
        """
        return self._max_start_date

    @max_start_date.setter
    def max_start_date(self, max_start_date: datetime):
        """Sets the max_start_date of this GetProgramsDto.

        Gets or sets the maximum premiere start date.  Optional.  # noqa: E501

        :param max_start_date: The max_start_date of this GetProgramsDto.
        :type max_start_date: datetime
        """

        self._max_start_date = max_start_date

    @property
    def min_end_date(self) -> datetime:
        """Gets the min_end_date of this GetProgramsDto.

        Gets or sets the minimum premiere end date.  Optional.  # noqa: E501

        :return: The min_end_date of this GetProgramsDto.
        :rtype: datetime
        """
        return self._min_end_date

    @min_end_date.setter
    def min_end_date(self, min_end_date: datetime):
        """Sets the min_end_date of this GetProgramsDto.

        Gets or sets the minimum premiere end date.  Optional.  # noqa: E501

        :param min_end_date: The min_end_date of this GetProgramsDto.
        :type min_end_date: datetime
        """

        self._min_end_date = min_end_date

    @property
    def min_start_date(self) -> datetime:
        """Gets the min_start_date of this GetProgramsDto.

        Gets or sets the minimum premiere start date.  Optional.  # noqa: E501

        :return: The min_start_date of this GetProgramsDto.
        :rtype: datetime
        """
        return self._min_start_date

    @min_start_date.setter
    def min_start_date(self, min_start_date: datetime):
        """Sets the min_start_date of this GetProgramsDto.

        Gets or sets the minimum premiere start date.  Optional.  # noqa: E501

        :param min_start_date: The min_start_date of this GetProgramsDto.
        :type min_start_date: datetime
        """

        self._min_start_date = min_start_date

    @property
    def series_timer_id(self) -> str:
        """Gets the series_timer_id of this GetProgramsDto.

        Gets or sets filter by series timer id.  Optional.  # noqa: E501

        :return: The series_timer_id of this GetProgramsDto.
        :rtype: str
        """
        return self._series_timer_id

    @series_timer_id.setter
    def series_timer_id(self, series_timer_id: str):
        """Sets the series_timer_id of this GetProgramsDto.

        Gets or sets filter by series timer id.  Optional.  # noqa: E501

        :param series_timer_id: The series_timer_id of this GetProgramsDto.
        :type series_timer_id: str
        """

        self._series_timer_id = series_timer_id

    @property
    def sort_by(self) -> str:
        """Gets the sort_by of this GetProgramsDto.

        Gets or sets specify one or more sort orders, comma delimited. Options: Name, StartDate.  Optional.  # noqa: E501

        :return: The sort_by of this GetProgramsDto.
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by: str):
        """Sets the sort_by of this GetProgramsDto.

        Gets or sets specify one or more sort orders, comma delimited. Options: Name, StartDate.  Optional.  # noqa: E501

        :param sort_by: The sort_by of this GetProgramsDto.
        :type sort_by: str
        """

        self._sort_by = sort_by

    @property
    def sort_order(self) -> str:
        """Gets the sort_order of this GetProgramsDto.

        Gets or sets sort Order - Ascending,Descending.  # noqa: E501

        :return: The sort_order of this GetProgramsDto.
        :rtype: str
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order: str):
        """Sets the sort_order of this GetProgramsDto.

        Gets or sets sort Order - Ascending,Descending.  # noqa: E501

        :param sort_order: The sort_order of this GetProgramsDto.
        :type sort_order: str
        """

        self._sort_order = sort_order

    @property
    def start_index(self) -> int:
        """Gets the start_index of this GetProgramsDto.

        Gets or sets the record index to start at. All items with a lower index will be dropped from the results.  Optional.  # noqa: E501

        :return: The start_index of this GetProgramsDto.
        :rtype: int
        """
        return self._start_index

    @start_index.setter
    def start_index(self, start_index: int):
        """Sets the start_index of this GetProgramsDto.

        Gets or sets the record index to start at. All items with a lower index will be dropped from the results.  Optional.  # noqa: E501

        :param start_index: The start_index of this GetProgramsDto.
        :type start_index: int
        """

        self._start_index = start_index

    @property
    def user_id(self) -> str:
        """Gets the user_id of this GetProgramsDto.

        Gets or sets optional. Filter by user id.  # noqa: E501

        :return: The user_id of this GetProgramsDto.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this GetProgramsDto.

        Gets or sets optional. Filter by user id.  # noqa: E501

        :param user_id: The user_id of this GetProgramsDto.
        :type user_id: str
        """

        self._user_id = user_id
