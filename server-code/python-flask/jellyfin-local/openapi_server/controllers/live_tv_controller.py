import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.channel_mapping_options_dto import ChannelMappingOptionsDto  # noqa: E501
from openapi_server.models.channel_type import ChannelType  # noqa: E501
from openapi_server.models.get_programs_dto import GetProgramsDto  # noqa: E501
from openapi_server.models.guide_info import GuideInfo  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.listings_provider_info import ListingsProviderInfo  # noqa: E501
from openapi_server.models.live_tv_info import LiveTvInfo  # noqa: E501
from openapi_server.models.name_id_pair import NameIdPair  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.recording_status import RecordingStatus  # noqa: E501
from openapi_server.models.series_timer_info_dto import SeriesTimerInfoDto  # noqa: E501
from openapi_server.models.series_timer_info_dto_query_result import SeriesTimerInfoDtoQueryResult  # noqa: E501
from openapi_server.models.set_channel_mapping_dto import SetChannelMappingDto  # noqa: E501
from openapi_server.models.sort_order import SortOrder  # noqa: E501
from openapi_server.models.timer_info_dto import TimerInfoDto  # noqa: E501
from openapi_server.models.timer_info_dto_query_result import TimerInfoDtoQueryResult  # noqa: E501
from openapi_server.models.tuner_channel_mapping import TunerChannelMapping  # noqa: E501
from openapi_server.models.tuner_host_info import TunerHostInfo  # noqa: E501
from openapi_server import util


def add_listing_provider(pw=None, validate_listings=None, validate_login=None, listings_provider_info=None):  # noqa: E501
    """Adds a listings provider.

     # noqa: E501

    :param pw: Password.
    :type pw: str
    :param validate_listings: Validate listings.
    :type validate_listings: bool
    :param validate_login: Validate login.
    :type validate_login: bool
    :param listings_provider_info: New listings info.
    :type listings_provider_info: dict | bytes

    :rtype: Union[ListingsProviderInfo, Tuple[ListingsProviderInfo, int], Tuple[ListingsProviderInfo, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        listings_provider_info = ListingsProviderInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_tuner_host(tuner_host_info=None):  # noqa: E501
    """Adds a tuner host.

     # noqa: E501

    :param tuner_host_info: New tuner host.
    :type tuner_host_info: dict | bytes

    :rtype: Union[TunerHostInfo, Tuple[TunerHostInfo, int], Tuple[TunerHostInfo, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        tuner_host_info = TunerHostInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def cancel_series_timer(timer_id):  # noqa: E501
    """Cancels a live tv series timer.

     # noqa: E501

    :param timer_id: Timer id.
    :type timer_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def cancel_timer(timer_id):  # noqa: E501
    """Cancels a live tv timer.

     # noqa: E501

    :param timer_id: Timer id.
    :type timer_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_series_timer(series_timer_info_dto=None):  # noqa: E501
    """Creates a live tv series timer.

     # noqa: E501

    :param series_timer_info_dto: New series timer info.
    :type series_timer_info_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        series_timer_info_dto = SeriesTimerInfoDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_timer(timer_info_dto=None):  # noqa: E501
    """Creates a live tv timer.

     # noqa: E501

    :param timer_info_dto: New timer info.
    :type timer_info_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        timer_info_dto = TimerInfoDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_listing_provider(id=None):  # noqa: E501
    """Delete listing provider.

     # noqa: E501

    :param id: Listing provider id.
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_recording(recording_id):  # noqa: E501
    """Deletes a live tv recording.

     # noqa: E501

    :param recording_id: Recording id.
    :type recording_id: str
    :type recording_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_tuner_host(id=None):  # noqa: E501
    """Deletes a tuner host.

     # noqa: E501

    :param id: Tuner host id.
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def discover_tuners(new_devices_only=None):  # noqa: E501
    """Discover tuners.

     # noqa: E501

    :param new_devices_only: Only discover new tuners.
    :type new_devices_only: bool

    :rtype: Union[List[TunerHostInfo], Tuple[List[TunerHostInfo], int], Tuple[List[TunerHostInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def discvover_tuners(new_devices_only=None):  # noqa: E501
    """Discover tuners.

     # noqa: E501

    :param new_devices_only: Only discover new tuners.
    :type new_devices_only: bool

    :rtype: Union[List[TunerHostInfo], Tuple[List[TunerHostInfo], int], Tuple[List[TunerHostInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_channel(channel_id, user_id=None):  # noqa: E501
    """Gets a live tv channel.

     # noqa: E501

    :param channel_id: Channel id.
    :type channel_id: str
    :type channel_id: str
    :param user_id: Optional. Attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_channel_mapping_options(provider_id=None):  # noqa: E501
    """Get channel mapping options.

     # noqa: E501

    :param provider_id: Provider id.
    :type provider_id: str

    :rtype: Union[ChannelMappingOptionsDto, Tuple[ChannelMappingOptionsDto, int], Tuple[ChannelMappingOptionsDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_default_listing_provider():  # noqa: E501
    """Gets default listings provider info.

     # noqa: E501


    :rtype: Union[ListingsProviderInfo, Tuple[ListingsProviderInfo, int], Tuple[ListingsProviderInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_default_timer(program_id=None):  # noqa: E501
    """Gets the default values for a new timer.

     # noqa: E501

    :param program_id: Optional. To attach default values based on a program.
    :type program_id: str

    :rtype: Union[SeriesTimerInfoDto, Tuple[SeriesTimerInfoDto, int], Tuple[SeriesTimerInfoDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_guide_info():  # noqa: E501
    """Get guid info.

     # noqa: E501


    :rtype: Union[GuideInfo, Tuple[GuideInfo, int], Tuple[GuideInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_lineups(id=None, type=None, location=None, country=None):  # noqa: E501
    """Gets available lineups.

     # noqa: E501

    :param id: Provider id.
    :type id: str
    :param type: Provider type.
    :type type: str
    :param location: Location.
    :type location: str
    :param country: Country.
    :type country: str

    :rtype: Union[List[NameIdPair], Tuple[List[NameIdPair], int], Tuple[List[NameIdPair], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_live_recording_file(recording_id):  # noqa: E501
    """Gets a live tv recording stream.

     # noqa: E501

    :param recording_id: Recording id.
    :type recording_id: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_live_stream_file(stream_id, container):  # noqa: E501
    """Gets a live tv channel stream.

     # noqa: E501

    :param stream_id: Stream id.
    :type stream_id: str
    :param container: Container type.
    :type container: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_live_tv_channels(type=None, user_id=None, start_index=None, is_movie=None, is_series=None, is_news=None, is_kids=None, is_sports=None, limit=None, is_favorite=None, is_liked=None, is_disliked=None, enable_images=None, image_type_limit=None, enable_image_types=None, fields=None, enable_user_data=None, sort_by=None, sort_order=None, enable_favorite_sorting=None, add_current_program=None):  # noqa: E501
    """Gets available live tv channels.

     # noqa: E501

    :param type: Optional. Filter by channel type.
    :type type: dict | bytes
    :param user_id: Optional. Filter by user and attach user data.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param is_movie: Optional. Filter for movies.
    :type is_movie: bool
    :param is_series: Optional. Filter for series.
    :type is_series: bool
    :param is_news: Optional. Filter for news.
    :type is_news: bool
    :param is_kids: Optional. Filter for kids.
    :type is_kids: bool
    :param is_sports: Optional. Filter for sports.
    :type is_sports: bool
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param is_favorite: Optional. Filter by channels that are favorites, or not.
    :type is_favorite: bool
    :param is_liked: Optional. Filter by channels that are liked, or not.
    :type is_liked: bool
    :param is_disliked: Optional. Filter by channels that are disliked, or not.
    :type is_disliked: bool
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: \&quot;Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param sort_by: Optional. Key to sort by.
    :type sort_by: List[str]
    :param sort_order: Optional. Sort order.
    :type sort_order: dict | bytes
    :param enable_favorite_sorting: Optional. Incorporate favorite and like status into channel sorting.
    :type enable_favorite_sorting: bool
    :param add_current_program: Optional. Adds current program info to each channel.
    :type add_current_program: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        type =  ChannelType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        sort_order =  SortOrder.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_live_tv_info():  # noqa: E501
    """Gets available live tv services.

     # noqa: E501


    :rtype: Union[LiveTvInfo, Tuple[LiveTvInfo, int], Tuple[LiveTvInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_live_tv_programs(channel_ids=None, user_id=None, min_start_date=None, has_aired=None, is_airing=None, max_start_date=None, min_end_date=None, max_end_date=None, is_movie=None, is_series=None, is_news=None, is_kids=None, is_sports=None, start_index=None, limit=None, sort_by=None, sort_order=None, genres=None, genre_ids=None, enable_images=None, image_type_limit=None, enable_image_types=None, enable_user_data=None, series_timer_id=None, library_series_id=None, fields=None, enable_total_record_count=None):  # noqa: E501
    """Gets available live tv epgs.

     # noqa: E501

    :param channel_ids: The channels to return guide information for.
    :type channel_ids: List[str]
    :param user_id: Optional. Filter by user id.
    :type user_id: str
    :type user_id: str
    :param min_start_date: Optional. The minimum premiere start date.
    :type min_start_date: str
    :param has_aired: Optional. Filter by programs that have completed airing, or not.
    :type has_aired: bool
    :param is_airing: Optional. Filter by programs that are currently airing, or not.
    :type is_airing: bool
    :param max_start_date: Optional. The maximum premiere start date.
    :type max_start_date: str
    :param min_end_date: Optional. The minimum premiere end date.
    :type min_end_date: str
    :param max_end_date: Optional. The maximum premiere end date.
    :type max_end_date: str
    :param is_movie: Optional. Filter for movies.
    :type is_movie: bool
    :param is_series: Optional. Filter for series.
    :type is_series: bool
    :param is_news: Optional. Filter for news.
    :type is_news: bool
    :param is_kids: Optional. Filter for kids.
    :type is_kids: bool
    :param is_sports: Optional. Filter for sports.
    :type is_sports: bool
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param sort_by: Optional. Specify one or more sort orders, comma delimited. Options: Name, StartDate.
    :type sort_by: str
    :param sort_order: Sort Order - Ascending,Descending.
    :type sort_order: str
    :param genres: The genres to return guide information for.
    :type genres: List[str]
    :param genre_ids: The genre ids to return guide information for.
    :type genre_ids: List[str]
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param series_timer_id: Optional. Filter by series timer id.
    :type series_timer_id: str
    :param library_series_id: Optional. Filter by library series id.
    :type library_series_id: str
    :type library_series_id: str
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_total_record_count: Retrieve total record count.
    :type enable_total_record_count: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    min_start_date = util.deserialize_datetime(min_start_date)
    max_start_date = util.deserialize_datetime(max_start_date)
    min_end_date = util.deserialize_datetime(min_end_date)
    max_end_date = util.deserialize_datetime(max_end_date)
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_program(program_id, user_id=None):  # noqa: E501
    """Gets a live tv program.

     # noqa: E501

    :param program_id: Program id.
    :type program_id: str
    :param user_id: Optional. Attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_programs(get_programs_dto=None):  # noqa: E501
    """Gets available live tv epgs.

     # noqa: E501

    :param get_programs_dto: Request body.
    :type get_programs_dto: dict | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_programs_dto = GetProgramsDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_recommended_programs(user_id=None, limit=None, is_airing=None, has_aired=None, is_series=None, is_movie=None, is_news=None, is_kids=None, is_sports=None, enable_images=None, image_type_limit=None, enable_image_types=None, genre_ids=None, fields=None, enable_user_data=None, enable_total_record_count=None):  # noqa: E501
    """Gets recommended live tv epgs.

     # noqa: E501

    :param user_id: Optional. filter by user id.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param is_airing: Optional. Filter by programs that are currently airing, or not.
    :type is_airing: bool
    :param has_aired: Optional. Filter by programs that have completed airing, or not.
    :type has_aired: bool
    :param is_series: Optional. Filter for series.
    :type is_series: bool
    :param is_movie: Optional. Filter for movies.
    :type is_movie: bool
    :param is_news: Optional. Filter for news.
    :type is_news: bool
    :param is_kids: Optional. Filter for kids.
    :type is_kids: bool
    :param is_sports: Optional. Filter for sports.
    :type is_sports: bool
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param genre_ids: The genres to return guide information for.
    :type genre_ids: List[str]
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_user_data: Optional. include user data.
    :type enable_user_data: bool
    :param enable_total_record_count: Retrieve total record count.
    :type enable_total_record_count: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_recording(recording_id, user_id=None):  # noqa: E501
    """Gets a live tv recording.

     # noqa: E501

    :param recording_id: Recording id.
    :type recording_id: str
    :type recording_id: str
    :param user_id: Optional. Attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_recording_folders(user_id=None):  # noqa: E501
    """Gets recording folders.

     # noqa: E501

    :param user_id: Optional. Filter by user and attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_recording_group(group_id):  # noqa: E501
    """Get recording group.

     # noqa: E501

    :param group_id: Group id.
    :type group_id: str
    :type group_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_recording_groups(user_id=None):  # noqa: E501
    """Gets live tv recording groups.

     # noqa: E501

    :param user_id: Optional. Filter by user and attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_recordings(channel_id=None, user_id=None, start_index=None, limit=None, status=None, is_in_progress=None, series_timer_id=None, enable_images=None, image_type_limit=None, enable_image_types=None, fields=None, enable_user_data=None, is_movie=None, is_series=None, is_kids=None, is_sports=None, is_news=None, is_library_item=None, enable_total_record_count=None):  # noqa: E501
    """Gets live tv recordings.

     # noqa: E501

    :param channel_id: Optional. Filter by channel id.
    :type channel_id: str
    :param user_id: Optional. Filter by user and attach user data.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param status: Optional. Filter by recording status.
    :type status: dict | bytes
    :param is_in_progress: Optional. Filter by recordings that are in progress, or not.
    :type is_in_progress: bool
    :param series_timer_id: Optional. Filter by recordings belonging to a series timer.
    :type series_timer_id: str
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param is_movie: Optional. Filter for movies.
    :type is_movie: bool
    :param is_series: Optional. Filter for series.
    :type is_series: bool
    :param is_kids: Optional. Filter for kids.
    :type is_kids: bool
    :param is_sports: Optional. Filter for sports.
    :type is_sports: bool
    :param is_news: Optional. Filter for news.
    :type is_news: bool
    :param is_library_item: Optional. Filter for is library item.
    :type is_library_item: bool
    :param enable_total_record_count: Optional. Return total record count.
    :type enable_total_record_count: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        status =  RecordingStatus.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_recordings_series(channel_id=None, user_id=None, group_id=None, start_index=None, limit=None, status=None, is_in_progress=None, series_timer_id=None, enable_images=None, image_type_limit=None, enable_image_types=None, fields=None, enable_user_data=None, enable_total_record_count=None):  # noqa: E501
    """Gets live tv recording series.

     # noqa: E501

    :param channel_id: Optional. Filter by channel id.
    :type channel_id: str
    :param user_id: Optional. Filter by user and attach user data.
    :type user_id: str
    :type user_id: str
    :param group_id: Optional. Filter by recording group.
    :type group_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param status: Optional. Filter by recording status.
    :type status: dict | bytes
    :param is_in_progress: Optional. Filter by recordings that are in progress, or not.
    :type is_in_progress: bool
    :param series_timer_id: Optional. Filter by recordings belonging to a series timer.
    :type series_timer_id: str
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param enable_total_record_count: Optional. Return total record count.
    :type enable_total_record_count: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        status =  RecordingStatus.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_schedules_direct_countries():  # noqa: E501
    """Gets available countries.

     # noqa: E501


    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_series_timer(timer_id):  # noqa: E501
    """Gets a live tv series timer.

     # noqa: E501

    :param timer_id: Timer id.
    :type timer_id: str

    :rtype: Union[SeriesTimerInfoDto, Tuple[SeriesTimerInfoDto, int], Tuple[SeriesTimerInfoDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_series_timers(sort_by=None, sort_order=None):  # noqa: E501
    """Gets live tv series timers.

     # noqa: E501

    :param sort_by: Optional. Sort by SortName or Priority.
    :type sort_by: str
    :param sort_order: Optional. Sort in Ascending or Descending order.
    :type sort_order: dict | bytes

    :rtype: Union[SeriesTimerInfoDtoQueryResult, Tuple[SeriesTimerInfoDtoQueryResult, int], Tuple[SeriesTimerInfoDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        sort_order =  SortOrder.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_timer(timer_id):  # noqa: E501
    """Gets a timer.

     # noqa: E501

    :param timer_id: Timer id.
    :type timer_id: str

    :rtype: Union[TimerInfoDto, Tuple[TimerInfoDto, int], Tuple[TimerInfoDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_timers(channel_id=None, series_timer_id=None, is_active=None, is_scheduled=None):  # noqa: E501
    """Gets the live tv timers.

     # noqa: E501

    :param channel_id: Optional. Filter by channel id.
    :type channel_id: str
    :param series_timer_id: Optional. Filter by timers belonging to a series timer.
    :type series_timer_id: str
    :param is_active: Optional. Filter by timers that are active.
    :type is_active: bool
    :param is_scheduled: Optional. Filter by timers that are scheduled.
    :type is_scheduled: bool

    :rtype: Union[TimerInfoDtoQueryResult, Tuple[TimerInfoDtoQueryResult, int], Tuple[TimerInfoDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tuner_host_types():  # noqa: E501
    """Get tuner host types.

     # noqa: E501


    :rtype: Union[List[NameIdPair], Tuple[List[NameIdPair], int], Tuple[List[NameIdPair], int, Dict[str, str]]
    """
    return 'do some magic!'


def reset_tuner(tuner_id):  # noqa: E501
    """Resets a tv tuner.

     # noqa: E501

    :param tuner_id: Tuner id.
    :type tuner_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_channel_mapping(set_channel_mapping_dto):  # noqa: E501
    """Set channel mappings.

     # noqa: E501

    :param set_channel_mapping_dto: The set channel mapping dto.
    :type set_channel_mapping_dto: dict | bytes

    :rtype: Union[TunerChannelMapping, Tuple[TunerChannelMapping, int], Tuple[TunerChannelMapping, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_channel_mapping_dto = SetChannelMappingDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_series_timer(timer_id, series_timer_info_dto=None):  # noqa: E501
    """Updates a live tv series timer.

     # noqa: E501

    :param timer_id: Timer id.
    :type timer_id: str
    :param series_timer_info_dto: New series timer info.
    :type series_timer_info_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        series_timer_info_dto = SeriesTimerInfoDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_timer(timer_id, timer_info_dto=None):  # noqa: E501
    """Updates a live tv timer.

     # noqa: E501

    :param timer_id: Timer id.
    :type timer_id: str
    :param timer_info_dto: New timer info.
    :type timer_info_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        timer_info_dto = TimerInfoDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
